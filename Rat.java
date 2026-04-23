public interface Rat {
    default void puiPui() {
        System.out.println("PUI PUI!");
    }

    default void eat(String food) {
        System.out.println("正在吃 " + food);
    }

    default void pupu() {
        System.out.println("PUPU!");
    }
}