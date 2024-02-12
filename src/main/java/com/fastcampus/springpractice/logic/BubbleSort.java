package com.fastcampus.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BubbleSort <T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        // 입력과 출력의 메모리를 구분 -> 출력에 변화를 줘도 입력에 영향이 가지 않음
        List<T> output = new ArrayList<>(list);

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
