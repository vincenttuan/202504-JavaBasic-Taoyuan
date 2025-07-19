// 模擬自動交易
// 策略:
// 策略一: 當價格 <= 90% (2000 * 0.9 = 1800) -> 買進全部能買的
// 策略二: 當價格 >= 110% (2000 * 1.1 = 1800) -> 賣出全部持有虛擬幣
// 當 餘額 - 10000 >= 10000 => 獲利達成, 結束交易

public class AutoTrade {

	public static void main(String[] args) {
		int basePrice = 2000;
		int minPrice = basePrice * 80 / 100;  // 最低價: 1600
		int maxPrice = basePrice * 120 / 100; // 最高價: 2200

		int balanceTWD = 10000; // 初始資金
		int coinBalance = 0;    // 虛擬幣庫存

		int round = 0; // 交易次數

		while(true) {
			round++;
			// 每一回合生成新價格 ±20%
			int coinPrice = minPrice + (int)(Math.random() * (maxPrice - minPrice + 1));
			// 顯示當前狀態
			System.out.printf("第 %d 回合, 目前價格: %,d 元 台幣餘額: %,d 虛擬幣持有: %d%n",
								round, coinPrice, balanceTWD, coinBalance);

			// 策略一: 當價格 <= 90% (2000 * 0.9 = 1800) -> 買進全部能買的
			if(coinPrice <= basePrice * 90 / 100) {
				int maxBuy = balanceTWD / coinPrice;
				if(maxBuy > 0) {
					int cost = maxBuy * coinPrice;
					balanceTWD = balanceTWD - cost;
					coinBalance = coinBalance + maxBuy;
					System.out.printf("買進 %,d 枚, 成本 %,d 元%n", maxBuy, cost);
				}
			} 
			// 策略二: 當價格 >= 110% (2000 * 1.1 = 1800) -> 賣出全部持有虛擬幣 
			else if(coinPrice >= basePrice * 110 / 100) {
				if(coinBalance > 0) {
					int revene = coinBalance * coinPrice;
					balanceTWD = balanceTWD + revene;
					System.out.printf("賣出 %,d 枚, 收入 %,d 元%n", coinBalance, revene);
					coinBalance = 0;
				}
			}

			// 計算獲利
			int profit = balanceTWD - 10000;
			System.out.printf("總獲利: %,d 元%n", profit);
			System.out.println("----------------------------------------");

			// 結束條件
			if(profit > 10000) {
				System.out.printf("恭喜你獲利達成 ! 總資產: %,d 元 花了 %d 回合%n", balanceTWD, round);
				break;
			}

		}

	}

}