package pe.edu.utp.perdata.model;

public class Producto {

        private long id;
        private String nombre;
        private String descripcion;
        private String imagen;
        private double precio;
        private int cantidad;
        private boolean estado;
        private int usuario_id;
        private int categoria_id;

        public Producto(long id, String nombre, String descripcion, String imagen, double precio, int cantidad, int usuario_id, int categoria_id) {
                this.id = id;
                this.nombre = nombre;
                this.descripcion = descripcion;
                this.imagen = imagen;
                this.precio = precio;
                this.cantidad = cantidad;
                this.usuario_id = usuario_id;
                this.categoria_id = categoria_id;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getDescripcion() {
                return descripcion;
        }

        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }

        public String getImagen() {
                return imagen;
        }

        public void setImagen(String imagen) {
                this.imagen = imagen;
        }

        public double getPrecio() {
                return precio;
        }

        public void setPrecio(double precio) {
                this.precio = precio;
        }

        public int getCantidad() {
                return cantidad;
        }

        public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
        }

        public boolean isEstado() {
                return estado;
        }

        public void setEstado(boolean estado) {
                this.estado = estado;
        }

        public int getUsuario_id() {
                return usuario_id;
        }

        public void setUsuario_id(int usuario_id) {
                this.usuario_id = usuario_id;
        }

        public int getCategoria_id() {
                return categoria_id;
        }

        public void setCategoria_id(int categoria_id) {
                this.categoria_id = categoria_id;
        }
}
