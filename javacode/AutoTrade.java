// 模擬自動交易
// 策略:
// 策略一: 當價格 <= 90% (2000 * 0.9 = 1800) -> 買進全部能買的
// 策略二: 當價格 >= 110% (2000 * 1.1 = 1800) -> 賣出全部持有虛擬幣
// 當 餘額 - 10000 >= 10000 => 獲利達成, 結束交易
public class AutoTrade {

    public static void main(String[] args) {
        int basePrice = 2000;
        int minPrice = basePrice * 80 / 100;   // 最低價: 1600
        int maxPrice = basePrice * 120 / 100;  // 最高價: 2400

        int balanceTWD = 10000; // 初始資金
        int coinBalance = 0;    // 虛擬幣庫存

        int maxRound = 100;          // 交易次數上限
        int round = 0;          // 交易次數

        double buyFeeRate = 0.01; // 買進手續費 1%
        double sellFeeRate = 0.01; // 賣出手續費 1%



        while (true) {
            if(round >= maxRound) {
                System.out.printf("交易次數達到 %d 次, 停止交易 !%n", maxRound);
                break;
            }
            round++;
            // 每回合生成新價格 ±20%
            int coinPrice = minPrice + (int)(Math.random() * (maxPrice - minPrice + 1));

            System.out.printf("第 %d 回合, 目前價格: %,d 元 台幣餘額: %,d 虛擬幣持有: %d%n",
                    round, coinPrice, balanceTWD, coinBalance);

            // 策略一：買進全部可買的，計算含手續費的總成本
            if (coinPrice <= basePrice * 90 / 100) {
                // 總成本 = (單價 × 買進數量) × (1 + 手續費率)
                int maxBuy = (int)(balanceTWD / (coinPrice * (1 + buyFeeRate)));
                if (maxBuy > 0) {
                    int tradeCost = coinPrice * maxBuy;
                    int fee = (int)Math.ceil(tradeCost * buyFeeRate);
                    int totalCost = tradeCost + fee;
                    balanceTWD -= totalCost;
                    coinBalance += maxBuy;
                    System.out.printf("買進 %,d 枚 (單價: %,d 手續費: %,d)總成本: %,d 元%n",
                            maxBuy, coinPrice, fee, totalCost);
                }
            } 
            // 策略二：賣出全部持有虛擬幣，計算收回額（扣手續費）
            else if (coinPrice >= basePrice * 110 / 100) {
                if (coinBalance > 0) {
                    int sellAmount = coinBalance;
                    int revenue = coinPrice * sellAmount;
                    int fee = (int)Math.ceil(revenue * sellFeeRate);
                    int netRevenue = revenue - fee;
                    balanceTWD += netRevenue;
                    System.out.printf("賣出 %,d 枚 (單價: %,d 收入: %,d 手續費: %,d)實得: %,d 元%n",
                            sellAmount, coinPrice, revenue, fee, netRevenue);
                    coinBalance = 0;
                }
            }

            // 總獲利
            int profit = balanceTWD - 10000;
            System.out.printf("總獲利: %,d 元%n", profit);
            System.out.println("----------------------------------------");

            // 結束條件
            if (profit >= 10000) {
                System.out.printf("恭喜你獲利達成 ! 總資產: %,d 元 花了 %d 回合%n", balanceTWD, round);
                break;
            }
        }
    }
}
