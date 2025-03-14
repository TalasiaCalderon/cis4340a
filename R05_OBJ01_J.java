public class R05_OBJ01_J {

    public class Widget {
        private int total; // Number of elements
        
        public int getTotal () {
            return total;
        }

        void add() {
          if (total < Integer.MAX_VALUE) {     
            total++;
            // ...
          } else {
            throw new ArithmeticException("Overflow");
          }
        }
       
        void remove() { 
          if (total > 0) {     
            total--;
            // ...
          } else {
            throw new ArithmeticException("Overflow");
          }
        }
    }
}
