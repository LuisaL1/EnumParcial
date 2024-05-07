public enum PartesDelPc {
    PROCESADOR("Procesador", "Central", 4, 350.000) {
        @Override
        public void mostrarFuncion() {
            System.out.println("Ejecuta instrucciones y procesos del sistema.");
        }
    },
    MEMORIA_RAM("Memoria RAM", "Temporal", 16, 150.000) {
        @Override
        public void mostrarFuncion() {
            System.out.println("Almacena temporalmente los datos en ejecución.");
        }
    },
    DISCO_DURO("Disco Duro", "Almacenamiento", 1024, 100.000) {
        @Override
        public void mostrarFuncion() {
            System.out.println("Almacena datos de manera permanente.");
        }
    },
    TARJETA_GRAFICA("Tarjeta Gráfica", "Visualización", 6, 400.000) {
        @Override
        public void mostrarFuncion() {
            System.out.println("Procesa y genera la salida de imágenes en la pantalla.");
        }
    };

    private final String nombre;
    private final String tipo;
    private final int capacidad;
    private final double precio;

    PartesDelPc(String nombre, String tipo, int capacidad, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public abstract void mostrarFuncion();

    public static void imprimirInformacion() {
        for (PartesDelPc parte : PartesDelPc.values()) {
            System.out.println(parte);
            parte.mostrarFuncion();
        }
    }

    @Override
    public String toString() {
        return "Parte: " + nombre + ", Tipo: " + tipo + ", Capacidad: " + capacidad + " GB, Precio: $" + precio;
    }

    public static void main(String[] args) {
        PartesDelPc.imprimirInformacion();
    }
}

