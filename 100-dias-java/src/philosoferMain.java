public class philosoferMain {
    public static void main(String[] args) {

        DiningPhilosifers diningPhilosophers = new DiningPhilosifers();

        Thread[] philosophers = new Thread[5];

        for (int i = 0; i < 5; ++i) {
            int philosopherId = i;
            philosophers[i] = new Thread(() -> {
                try {
                    for (int j = 0; j < 100; ++j) {  // Aqui, assumimos que cada filósofo comerá 100 vezes

                        diningPhilosophers.wantsToEat(philosopherId,
                                () -> System.out.println("O Filósofo " + philosopherId + " pegou o garfo esquerdo"),
                                () -> System.out.println("O Filósofo " + philosopherId + " pegou o garfo direito"),
                                () -> System.out.println("O Filósofo " + philosopherId + " está comendo"),
                                () -> System.out.println("O Filósofo " + philosopherId + " colocou o garfo esquerdo na mesa"),
                                () -> System.out.println("O Filósofo " + philosopherId + " colocou o garfo direito na mesa")
                        );

                        // Espere um pouco antes da próxima refeição
                        Thread.sleep(100);
                    }
                } catch (InterruptedException exception) {
                    System.out.println("O Filósofo " + philosopherId + " foi interrompido");
                }
            });

            philosophers[i].start();
        }

        // Aguardando todas as threads (filósofos) terminarem
        for (int i = 0; i < 5; ++i) {
            try {
                philosophers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os filósofos terminaram de comer");
    }
}

