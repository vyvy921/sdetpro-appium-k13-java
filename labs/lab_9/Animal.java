package labs.lab_9;

import java.security.SecureRandom;

public class Animal {

    protected int runSpeed;
    protected String name;
    protected boolean flyable;

    protected Animal(Builder builder) {
        this.runSpeed = builder.runSpeed;
        this.name = builder.name;
        this.flyable = builder.flyable;
    }

    // READ-ONLY
    public int getRunSpeed() {
        return runSpeed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    /**
     * WRITE ONLY
     * immutable object
     */

    public static class Builder {
        protected int runSpeed;
        protected String name;
        protected boolean flyable;

        public Builder setRunSpeed(int maxSpeed) {
            this.runSpeed = new SecureRandom().nextInt(maxSpeed + 1);
            return this;
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "runSpeed=" + runSpeed +
                ", name='" + name + '\'' +
                ", flyable=" + flyable +
                '}';
    }
}
