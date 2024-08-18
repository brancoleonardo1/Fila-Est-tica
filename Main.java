public class Main {
    public static void main(String[] args) {

        StaticQueue<Integer> queue = new StaticQueue<>(5);


        queue.add(1);
        queue.add(2);
        queue.add(3);


        System.out.println("Estado atual da fila após adicionar 3 elementos:");
        printQueue(queue);


        queue.remove();
        queue.remove();


        System.out.println("Estado da fila após remover 2 elementos:");
        printQueue(queue);


        queue.add(4);
        queue.add(5);



        System.out.println("Estado final da fila após adicionar mais 2 elementos:");
        printQueue(queue);
    }


    public static void printQueue(StaticQueue<Integer> queue) {

        for (int i = queue.getBase(); i <= queue.getTop(); i++) {
            System.out.print((Integer) queue.getData()[i] + " ");
        }
        System.out.println();
    }
}
