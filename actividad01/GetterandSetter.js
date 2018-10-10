class Tamal {
    constructor(color, tamanio, region, peso, precio) {

        this._color = color;
        this._tamanio = tamanio;
        this._region = region;
        this._peso = peso;
        this._precio = precio;
    }

    get color() {
        return this._color;
    }

    set color(value) {
        this._color = value;
    }

    get tamanio() {
        return this._tamanio;
    }

    set tamanio(value) {
        this._tamanio = value;
    }

    get region() {
        return this._region;
    }

    set region(value) {
        this._region = value;
    }

    get peso() {
        return this._peso;
    }

    set peso(value) {
        this._peso = value;
    }

    get precio() {
        return this._precio;
    }

    set precio(value) {
        this._precio = value;
    }
}

class Avion {
    constructor(color, precio, marca, turbina, capacidad) {

        this._color = color;
        this._precio = precio;
        this._marca = marca;
        this._turbina = turbina;
        this._capacidad = capacidad;
    }

    get color() {
        return this._color;
    }

    set color(value) {
        this._color = value;
    }

    get precio() {
        return this._precio;
    }

    set precio(value) {
        this._precio = value;
    }

    get marca() {
        return this._marca;
    }

    set marca(value) {
        this._marca = value;
    }

    get turbina() {
        return this._turbina;
    }

    set turbina(value) {
        this._turbina = value;
    }

    get capacidad() {
        return this._capacidad;
    }

    set capacidad(value) {
        this._capacidad = value;
    }
}

class Arbol {
    constructor(color, altura, edad, diametro, tipo) {

        this._color = color;
        this._altura = altura;
        this._edad = edad;
        this._diametro = diametro;
        this._tipo = tipo;
    }

    get color() {
        return this._color;
    }

    set color(value) {
        this._color = value;
    }

    get altura() {
        return this._altura;
    }

    set altura(value) {
        this._altura = value;
    }

    get edad() {
        return this._edad;
    }

    set edad(value) {
        this._edad = value;
    }

    get diametro() {
        return this._diametro;
    }

    set diametro(value) {
        this._diametro = value;
    }

    get tipo() {
        return this._tipo;
    }

    set tipo(value) {
        this._tipo = value;
    }
}

class Gafas {
    constructor(marca, precio, color, groso, estilo) {

        this._marca = marca;
        this._precio = precio;
        this._color = color;
        this._groso = groso;
        this._estilo = estilo;
    }

    get marca() {
        return this._marca;
    }

    set marca(value) {
        this._marca = value;
    }

    get precio() {
        return this._precio;
    }

    set precio(value) {
        this._precio = value;
    }

    get color() {
        return this._color;
    }

    set color(value) {
        this._color = value;
    }

    get groso() {
        return this._groso;
    }

    set groso(value) {
        this._groso = value;
    }

    get estilo() {
        return this._estilo;
    }

    set estilo(value) {
        this._estilo = value;
    }
}

class Persona {
    constructor(colorOjos, colorPiel, dedos, colorCabello, lunares) {

        this._colorOjos = colorOjos;
        this._colorPiel = colorPiel;
        this._dedos = dedos;
        this._colorCabello = colorCabello;
        this._lunares = lunares;
    }

    get colorOjos() {
        return this._colorOjos;
    }

    set colorOjos(value) {
        this._colorOjos = value;
    }

    get colorPiel() {
        return this._colorPiel;
    }

    set colorPiel(value) {
        this._colorPiel = value;
    }

    get dedos() {
        return this._dedos;
    }

    set dedos(value) {
        this._dedos = value;
    }

    get colorCabello() {
        return this._colorCabello;
    }

    set colorCabello(value) {
        this._colorCabello = value;
    }

    get lunares() {
        return this._lunares;
    }

    set lunares(value) {
        this._lunares = value;
    }
}

class Pan {
    constructor(tipo, precio, color, peso, sabor) {

        this._tipo = tipo;
        this._precio = precio;
        this._color = color;
        this._peso = peso;
        this._sabor = sabor;
    }

    get tipo() {
        return this._tipo;
    }

    set tipo(value) {
        this._tipo = value;
    }

    get precio() {
        return this._precio;
    }

    set precio(value) {
        this._precio = value;
    }

    get color() {
        return this._color;
    }

    set color(value) {
        this._color = value;
    }

    get peso() {
        return this._peso;
    }

    set peso(value) {
        this._peso = value;
    }

    get sabor() {
        return this._sabor;
    }

    set sabor(value) {
        this._sabor = value;
    }
}

const tamalTolimense = new Tamal("Verde", "Grande", "Tolima", 450, 5000);
const avionComercial = new Avion("Blanco", 1063000000, "Rolls Roys", 4, 450);
const arbolSauce =new Arbol("Ocre",25.3,350,20.3,"Sauce");
const gafasDeportivas=new Gafas("Gucci",250000,"Dorado",3.1,"Deportivas");
const personaAlbina=new Persona("Azules","Morena","Todos","Rubio",10);
const mogolla=new Pan("Dulce",500,"Cafe",10,"Dulce");