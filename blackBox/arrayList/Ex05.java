package blackBox.arrayList;

import java.util.ArrayList;

public class Ex05 {

    public static int getSurviving(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();
        for(int i=1; i<=n; i++){
            soldiers.add(i);
        }

        // 문제의 본질을 찾아 가장 쉬운형식으로 만드는 생각이 필요하다
        ArrayList<Integer> corpse_list = new ArrayList<>();
        while (n>=2) {
            for(int i=0; i<k-1; i++) {
                // 뒤로 보내는 것을 지우는 것으로 말함
                soldiers.add(soldiers.get(0));
                soldiers.remove(0);
            }

            corpse_list.add(soldiers.get(0));
            soldiers.remove(0);
            n--;
        }

        for (Integer corpse : corpse_list) {
            System.out.println(corpse + "번 군사가 죽습니다.");
        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println(getSurviving(8,3));
        System.out.println(getSurviving(20,5));
    }
}

//전쟁에서 처참하게 패배를 겪고 돌아온 김장군, 책임을 지기 위해 돌아 온 이들에게 자결을 제안한다.

//n명의 군사들이 동그렇게 서있고 , 한 명씩 세어 나가서 매 k번째 사람을 즉기로 한다.
//예을 들어서 8명의 군사들이 있고 매 3명마다 즉기로 하면 아래 순설로 군사들이 죽게된다.
//3 -> 6 -> 1 -> 5 -> 2 ->8 -> 4 -> 7
//하지만 아비한 김장군은 자신이 마지막으로 남아서 도망가려는 속셈이다.
//파라미터로 정수 n과 정수 k를 받고, 김장군이 살기 위해서 서 있어야 할 자리(int)를 리턴하주는
//단 arrayList를 사용할 것!!