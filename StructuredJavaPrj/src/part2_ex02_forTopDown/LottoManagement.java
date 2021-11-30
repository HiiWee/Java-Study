package part2_ex02_forTopDown;

public class LottoManagement {

	public static void main(String[] args) {
		
		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while(running)
		{
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				//create : 공간까지 만드는 작업
				//gen : 번호만 생성하는 작업
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottsManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			default:
				break;
			}
		}

	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] createLottsManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		return 0;
	}

}
