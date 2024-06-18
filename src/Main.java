import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Data data = new Data();
		Scanner scanner = new Scanner(System.in);

		while (true){
			System.out.println("スタレのガチャの確率を表示するよ！(exitと入力したら終了します)");
			System.out.println("入力: 欲しいキャラの数,欲しい光円錐の数,チケットの枚数");
			String in = scanner.nextLine();
			if (in.equals("exit")) {
				return;
			}

			String[] tmp = in.split(",");
			double p = data.search(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
			if (!Double.isNaN(p)){
				System.out.printf("入手確率は%f%%だよ！\n", p * 100d);
			} else {
				System.out.println("入力がおかしいよ");
			}
		}
	}
}
