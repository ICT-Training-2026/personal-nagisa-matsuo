/*
 * コマンドライン引数 サンプル
 * 作成：M.Takahashi
 */
class JavaGitEx {
	/* 
	 * コマンドライン引数で 名前・英語点数・数学点数 を受け取り
	 * 各要素と点数の合計を表示する。
	 */
	public static void main(String[] args) {
		if (args.length == 3) {							// 引数の要素数チェック
			System.out.println("----");
			System.out.println("名前：" + args[0]);
			System.out.println("英語：" + args[1]);
			System.out.println("数学：" + args[2]);
			System.out.println("----");
			int total = Integer.parseInt(args[1]) 		// 点数の合計計算
							+ Integer.parseInt(args[2]);
			System.out.println("合計：" + total);
		} else {
			System.out.println("名前・英語点数・数学点数を入力してください。");
		}
	}
}
