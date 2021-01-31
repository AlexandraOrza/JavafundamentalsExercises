package fundamentals;

public class Dog {
        private String name;

    public Dog(String azorel) {
    }

    public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name; //accesam din afara chiar dca e private
        }

        public boolean equals(Dog dog){
            return(this.name == dog.getName());
        }
    }

