package blackBox.arrayList;

import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList();
        System.out.println(nameList.isEmpty());
        nameList.add("홍길동");
//        System.out.println(nameList.isEmpty());
        nameList.add("장발장");
        nameList.add("홍길순");
        nameList.add("로미오");
        nameList.add("줄리엣");

        // 배열의 길이
        System.out.println(nameList.size());

        // 배열의 값
        System.out.println(nameList.get(3));
        System.out.println(nameList);

        // 배열 지우기
        String removeValue = nameList.remove(2);
        System.out.println(nameList.remove(2));
        System.out.println(nameList);

//        배열의 값을 당겨진다
        System.out.println(nameList.get(2));

        System.out.println(removeValue);

        // for문
        for(int i=0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        // for - each문
        for(String name : nameList){
            System.out.println(name);
        }

    }
}
