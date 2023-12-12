package blackBox.arrayList;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
/*
        배열의 단점
        배열은 항상 배열 길이를 정하고 시작한다
        배열을 사용하는 중에 길이를 변경할 수 없어 최대 길이 이상의 데이터를 넣을수 없다
        별의 중간에 니어 있는 요오를 비워 둘수 없으므로 뱅려 요소 위치를 변경해줘야 한다
*/

//      ArrayList<E> 배열 이름 = new ArrayList<E>() E = 제너릭 타입을 사용해야 한다.
        ArrayList<String> strs = new ArrayList<String>();

//      모든 기본 데이터 타입은 제너릭 타입으로 변경하여 사용해야 한다
        ArrayList<Integer> ints = new ArrayList<Integer>();

//      사용자가 만든 클래스를 데이터타입으로 arrayList를 만들수 있다
        ArrayList<Book> books = new ArrayList<Book>();

/*
        주요 매서드
        (boolean) add(e) : 요소 하나를 배열에 추가
        (int) size() : 배열의 길이을 알려줌
        (E) get(int index) : 배열의 index 위치에 있는 요소 값을 반환해줌
        (E) remove(int index) : 배열의 index 위치의 요소 값을 제거하고 그 값을 반환해줌
        (boolean) isEmpty() : 배열이 비어있는지 확인할때 사용함
*/
    }
}
