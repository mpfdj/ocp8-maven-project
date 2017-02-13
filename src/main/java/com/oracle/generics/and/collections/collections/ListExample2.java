package com.oracle.generics.and.collections.collections;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;



public class ListExample2 {

    class Car {
        private String segment;
        private String brand;
        private String model;

        public Car(String segment, String brand, String model) {
            this.segment = segment;
            this.brand = brand;
            this.model = model;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) return false;
            if (!(o instanceof Car)) return false;
            Car otherCar = (Car) o;

            return new EqualsBuilder()                  // Using Apache commons lang comparing TWO fields
                    .append(this.segment, otherCar.segment)
                    .append(this.brand, otherCar.brand)
                    .append(this.model, otherCar.model)
                    .build();
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("segment", segment)
                    .append("brand", brand)
                    .append("model", model)
                    .build();
        }
    }

    public static void main(String args[]) {
        ListExample2 outer = new ListExample2();

        Car porsche911 = outer.new Car("Sports car", "Porsche", "911");
        Car porscheBoxter = outer.new Car("Sports car", "Porsche", "Boxter");
        Car porschePanamera = outer.new Car("Luxury car", "Porsche", "Panamera");

        List<Car> cars = new ArrayList<>();
        cars.add(porsche911);
        //cars.add(porscheBoxter);
        cars.add(porschePanamera);
        cars.add(porsche911);


        // contains --> call equals()
        System.out.println("Contains 911: " + cars.contains(porsche911));
        System.out.println("Contains Boxter: " + cars.contains(porscheBoxter));
        System.out.println("Contains Panamera: " + cars.contains(porschePanamera));


        // indexOf --> call equals()
        System.out.println(cars.indexOf(porsche911));
        System.out.println(cars.indexOf(porscheBoxter));
        System.out.println(cars.indexOf(porschePanamera));


        // remove --> calls equals()
        cars.remove(porsche911);
        cars.remove(porscheBoxter);
        System.out.println(cars);
    }

}
