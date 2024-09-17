package lolgame;

import java.util.Scanner;

public class Application { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("소환사 협곡에 오신걸 환영합니다");
    System.out.print("챔피언을 선택해주세요 (이름으로 입력하세요) : ");
    String name = sc.nextLine();
    System.out.println(name + " 챔피언을 고르셨습니다. 행복한 소환사 협곡되세요!");
    Players play = new Players();

    while (true) {
        System.out.println("=======================================================================");
        System.out.println("1. 라인전시작");
        System.out.println("2. 한타 시작");
        System.out.println("3. 드래곤 사냥");
        System.out.println("4. 바론 사냥");
        System.out.println("5. 억제기 파괴 및 승패 유무");
        System.out.println("6. 프로그램 종료");
        System.out.print("메뉴를 선택해주세요 : ");
        int no = sc.nextInt();
        System.out.println("=======================================================================");

        switch (no) {
            case 1:
                play.Line();
                break;
            case 2:
                play.Gang();
                break;
            case 3:
                play.Dra();
                break;
            case 4:
                play.Bra();
                break;
            case 5:
                play.Win();
                break;
            case 6:
                System.out.println("롤을 종료하겠습니다.");
                break;
            default:
                System.out.println("잘못된 번호를 누르셨습니다. 다시 눌러주세요!");
        }
        if (no == 6) {
            System.out.println("프로그램 종료!!! 다시 하고싶으면 다시 게임을 키시덩가~");
            break;
        }

    }

}


}


