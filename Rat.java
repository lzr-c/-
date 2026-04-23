public interface Rat {
    default void puiPui() {
        System.out.println("PUI PUI!");
    }

    default void eat(Food food) {
        System.out.println("正在吃 " + food.name());
    }

    default void pupu() {
        System.out.println("PUPU!");
    }
}