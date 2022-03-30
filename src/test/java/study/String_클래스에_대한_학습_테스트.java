package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class String_클래스에_대한_학습_테스트 {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    /* 요구사항 1 */
    @Test
    @DisplayName("\"1,2\"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.")
    void contains(){
        // given
        String str = "1,2";

        // when
        String[] arr = str.split(",");

        // then
        assertThat(arr).contains("1", "2");
        assertThat(arr).containsExactly("1", "2");
    }

    @Test
    @DisplayName("\"1\"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.")
    void containsExactly(){
        // given
        String str = "1";

        // when
        String[] arr = str.split(",");

        // then
        assertThat(arr).contains("1");
        assertThat(arr).containsExactly("1");
    }

    /* 요구사항 2 */
    @Test
    @DisplayName("\"(1,2)\" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 \"1,2\"를 반환하도록 구현한다.")
    void substring(){
        // given
        String str = "(1,2)";

        // when
        String substring = str.substring(1, str.length() - 1);

        // then
        assertThat(substring).isEqualTo("1,2");
    }

    /* 요구사항 3 */
    @Test
    @DisplayName("\"abc\" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.")
    void charAt(){
        // given
        String str = "abc";

        // when
        int index = str.length();

        // then
        assertThatThrownBy(() -> {
            str.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: %d", index);
    }
}
