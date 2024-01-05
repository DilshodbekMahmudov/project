package com.project;

public class Car {
        private String color;

        private String model;

        private double price;

        private boolean isAutomatic;

    public Car(String color, String model, double price, boolean isAutomatic){
            this.color = color;
            this.model = model;
            this.price = price;
            this.isAutomatic = isAutomatic;

        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }

        public String getModel () {
            return model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        public boolean isAutomatic () {
            return isAutomatic;
        }

        public void setAutomatic ( boolean isAutomatic){
            this.isAutomatic = isAutomatic;
        }

        public void CarInformation () {
            System.out.println("Car : " + color + " " + model);
            System.out.println("Price : " + price + "$");
            System.out.println("This car " + (isAutomatic ? "isAutomatic" : "Mechanic") + " has a system.");

        }

    public static void main(String[] args) {
        Car car = new Car("Black", "Toyota Camry", 35000.0, true);
        car.CarInformation();

    }
  }






