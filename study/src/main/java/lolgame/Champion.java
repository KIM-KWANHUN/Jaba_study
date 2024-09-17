package lolgame;

import java.util.Random;

public class Champion {/* 게임설정
 * 플레이어가  */
    private int champion; // 챔피언
    private int kill; // 킬
    private int death; // 데스
    Random random = new Random();



    public void LineFight() {
        champion = random.nextInt(3);
        switch (champion) {
            case 0:
                System.out.println(" 상대방에게 1킬을 했습니다. 너무 잘하시네요? ");
                this.kill += 1;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 1 :
                System.out.println("너무 방심했습니다. ㅠㅠ 1데스를 기록합니다.");
                this.death -= 1;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 2:
                System.out.println(" 게속 킬을 기록합니다!! 상대 라이너가 정글러 탓만 하고 있어요. ");
                this.kill += 1;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
        }

    }

    public void GangFight() {
        champion = random.nextInt(6);
        switch (champion) {
            case 0 :
                System.out.println(" 한타에서 1킬을 기록합니다. 귀중한 1킬이네요 ");
                this.kill += 1;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 1 :
                System.out.println(" 더블킬!!! 미쳐날뛰고 있습니다. ");
                this.kill += 2;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 2 :
                System.out.println(" 트리플킬!!!! 정말 말도안되는 플레이!! ");
                this.kill += 3;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 3 :
                System.out.println(" 쿼드라킬!!!!!! 전장의 지배자 ");
                this.kill += 4;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 4 :
                System.out.println(" 펜타킬... 전장의 화신!!!! ");
                this.kill += 5;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            default :
                System.out.println(" 바로 물려서 죽어버리네요 ㅠㅠ 패배의 원흉이에요!! ");
                this.death -= 1;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;

        }


    }

    public void Dragon() {
        int Dragon = random.nextInt(3);
        switch (Dragon) {
            case 0 :
                System.out.println("드래곤을 잡았습니다. 얼릉 전열을 가다듬으세요!!");
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 1 :
                System.out.println("상대방에게 드래곤을 내줬습니다. 다음 드래곤이 나올때 까지 전열을 가다듬으세요!!");
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            default :
                System.out.println("상대방 정글러에게 드래곤을 스틸당했습니다. 비상!@!@!@!@!@");
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
        }

    }

    public void Baron() {
        int Baron = random.nextInt(3);
        switch (Baron) {
            case 0 :
                System.out.println("바론을 잡았습니다. 미니언들이 강화됩니다!! 얼릉 타워를 미세요");
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 1:
                System.out.println("상대방에게 바론을 내줬어요 ㅠㅠ 포탑을 지키세요!!");
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            default :
                System.out.println("상대방 정글러에게 바론을 스틸당했습니다. 비상!@!@!@!@!@");
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
        }
    }

    public void Winner() {
        champion = random.nextInt(6);
        switch (champion) {
            case 0 :
                System.out.println("마지막 한타에서 1킬을 기록합니다. 귀중한 1킬이네요!! 이 기세로 넥서스를 뿌시러 가요!! GG");
                this.kill += 1;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 1 :
                System.out.println("더블킬!!! 미쳐날뛰고 있습니다. 이 기세로 넥서스를 뿌시러 가요!! GG");
                this.kill += 2;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 2 :
                System.out.println("트리플킬!!!! 정말 말도안되는 플레이!! 이 기세로 넥서스를 뿌시러 가요!! GG");
                this.kill += 3;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 3 :
                System.out.println("쿼드라킬!!!!!! 전장의 지배자 이 기세로 넥서스를 뿌시러 가요!! GG");
                this.kill += 4;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            case 4 :
                System.out.println("펜타킬... 전장의 화신!!!! 경기 끝날 거 같아요!! GG");
                this.kill += 5;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;
            default:
                System.out.println(" 바로 물려서 죽어버리네요 패배의 원흉이에요!! 저희 넥서스가 파괴됩니다. GG ");
                this.death -= 1;
                System.out.println("총 : " + this.kill + " 킬 " + this.death + " 데스 ");
                break;

        }

        System.out.println("저희 총 킬은 : " + kill + " 킬이고 저희 데스는 : " + death + " 데스 입니다.");


    }
}
