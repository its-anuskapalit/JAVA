//day21
//THREAD
    class A extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 1");
            }
        }
    }

   class B extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 2");
            }
        }
    }
class online {
    public static void main(String args[]) {
        A ob = new A();
        B obj = new B();

        ob.start();
        obj.start();
    }
}
//.....................................................................................
    class A extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 1");
            }
        }
    }

   class B extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 2");
            }
        }
    }
class online {
    public static void main(String args[]) {
        A ob = new A();
        B obj = new B();
        System.out.println(ob.getPriority());
        System.out.println(obj.getPriority());

        ob.start();
        obj.start();

    }
}
//...................................................................
class A extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 1");
              try {
                Thread.sleep(10); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            }
        }
    }

   class B extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 2");
                try {
                    Thread.sleep(10); // Pause for 1 second
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
class online {
    public static void main(String args[]) {
        A ob = new A();
        B obj = new B();
        ob.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(Thread.MIN_PRIORITY);

        ob.start();
        obj.start();

    }
}
//..................................................................
class A implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task 1");
            try {
                Thread.sleep(10); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

class B implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task 2");
            try {
                Thread.sleep(10); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class online {
    public static void main(String args[]) {
        Runnable ob  = new A();
        Runnable obj = new B();
        Thread t1=new Thread(ob);
        t1.start();
        Thread t2=new Thread(obj);
        t2.start();

    }
}
