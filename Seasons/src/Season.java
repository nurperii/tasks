public enum Season {
    WINTER("Зима", "Холодная, снежная", "Декабрь, Январь, Февраль", -5),
    SPRING("Весна", "Теплая, цветущая", "Март, Апрель, Май", 8),
    SUMMER("Лето", "Жаркое, солнечное", "Июнь, Июль, Август", 25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Осень", "Прохладная, дождливая", "Сентябрь, Октябрь, Ноябрь", 15);

    private String name;
    private String fullDescription;
    private String months;
    private int averageTemperature;


    Season(String name, String fullDescription, String months, int averageTemperature) {
        this.name = name;
        this.fullDescription = fullDescription;
        this.months = months;
        this.averageTemperature = averageTemperature;
    }


    public String getDescription() {
        return "Холодное время года";
    }

    public String getName() {
        return name;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public String getMonths() {
        return months;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    @Override
    public String toString() {
        return "Время года: " + name + "\nОписание: " + getDescription() + "\nСредняя температура: " + averageTemperature + "°C" + "\nМесяцы: " + months + "\n";
    }
}