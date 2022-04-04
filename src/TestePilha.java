import java.util.Stack;

public class TestePilha {

    public static void main(String[] args) {
//		Pilha pilha = new Pilha();
//
//		pilha.push("Elvis");
//		System.out.println(pilha);
//
//		pilha.push("Luana");
//		System.out.println(pilha);
//
//		String r1 = pilha.pop();
//		System.out.println(r1);
//
//		String r2 = pilha.pop();
//		System.out.println(r2);
//
//		System.out.println(pilha.vazia());
//		pilha.push("Benjamin");
//		System.out.println(pilha.vazia());
//
//		System.out.println(pilha);

        Stack<String> stack = new Stack<>();
        stack.push("Elvis");
        stack.push("Luana");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        String nome = stack.peek();
        System.out.println(nome);

        System.out.println(stack);
    }
}
