package com.oracle.advanced.clazz.design.nestedclasses;

// Member nested interface
// Member nested class

class Server {
    private interface HotSwappable {
        void swap();  // The same as public abstract
    }

    public class Harddisk implements HotSwappable {
        @Override
        public void swap() {
            System.out.println("You can swap me any time.");
        }
    }
}

public class MemberInnerInterface {
    public static void main(String args[]) {
        Server server = new Server();
        Server.Harddisk harddisk = server.new Harddisk();
        harddisk.swap();
    }
}
