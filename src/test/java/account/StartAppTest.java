package account;

import org.junit.jupiter.api.*;

public class StartAppTest {
    @Nested
    @DisplayName("Tests for the static method main")
    class staticMainTests {
        @Test
        void test1() {
            String[] object = {"Foo bar", "Hello, world!", "foo bar", "Hello, world!", "Foo bar"};
            StartApp.main(object);
        }
        @Test
        void test2() {
            String[] object = {"This is a Text", "Foo bar", "Foo bar", "foo bar", "foo bar"};
            StartApp.main(object);
        }
        @Test
        void test3() {
            String[] object = {"This is a Text", "foo bar"};
            StartApp.main(object);
        }
        @Test
        void test4() {
            String[] object = {"This is a Text", "Foo bar", "Hello, world!", "Hello, world!", "This is a Text"};
            StartApp.main(object);
        }
        @Test
        void test5() {
            String[] object = {"Hello, world!", "This is a Text", "This is a Text"};
            StartApp.main(object);
        }
        @Test
        void test6() {
            String[] object = {};
            StartApp.main(object);
        }
    }
}
