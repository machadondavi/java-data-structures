package br.linked.list;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Teste1");
        list.add("Teste2");
        list.add("Teste3");
        list.add("Teste4");

        for(int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        list.remove("Teste3");

        for(int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

    }
}
