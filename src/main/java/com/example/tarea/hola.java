package com.example.tarea;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class hola {

    private int nextId = 16;

    private List<Pelicula> listaOriginal = Arrays.asList(
            new Pelicula(1, "Joker",
                    "Dirigida por Todd Phillips y protagonizada por Joaquin Phoenix, es un drama psicológico oscuro que narra el origen de Arthur Fleck, un comediante marginado con enfermedades mentales en la decadente Gotham City de los años 80. La película muestra su descenso a la locura, el crimen y su transformación en el icónico villano, fruto del maltrato social.",
                    "3 de octubre de 2019",
                    Arrays.asList("Drama", "Crimen", "Suspenso Psicologico"),
                    122),

            new Pelicula(2, "Toy Story",
                    "Dirigida por John Lasseter, es la primera película animada completamente por computadora. Cuenta la historia de Woody, un vaquero de juguete, y Buzz Lightyear, un astronauta de juguete, quienes deben aprender a dejar de lado sus celos y trabajar juntos para regresar con su dueño Andy.",
                    "22 de noviembre de 1995",
                    Arrays.asList("Animacion", "Aventura"),
                    81),

            new Pelicula(3, "Iron Man",
                    "Dirigida por Jon Favreau, protagonizada por Robert Downey Jr. como Tony Stark, un multimillonario fabricante de armas que tras sufrir un atentado decide crear una armadura de alta tecnología para escapar y posteriormente usarla para combatir el mal, dando inicio al Universo Cinematográfico de Marvel.",
                    "2 de mayo de 2008",
                    Arrays.asList("Accion", "Ciencia Ficcion", "Aventura"),
                    126),

            new Pelicula(4, "El Conjuro",
                    "Dirigida por James Wan, está basada en casos reales de los demonólogos Ed y Lorraine Warren. La película sigue la investigación de los Warren en una granja de Rhode Island donde la familia Perron experimenta fenómenos paranormales cada vez más terroríficos.",
                    "19 de julio de 2013",
                    Arrays.asList("Terror", "Suspenso", "Sobrenatural"),
                    112),

            new Pelicula(5, "Rapidos y Furiosos",
                    "Dirigida por Rob Cohen, es la primera entrega de la saga. Introduce a Dominic Toretto, líder de una banda de corredores callejeros en Los Ángeles, y al oficial Brian O'Conner, quien se infiltra para investigar robos de equipos electrónicos mientras se ve envuelto en el mundo de las carreras ilegales.",
                    "22 de junio de 2001",
                    Arrays.asList("Accion", "Crimen", "Suspenso"),
                    106),

            new Pelicula(6, "Jurassic World",
                    "Dirigida por Colin Trevorrow, es la cuarta entrega de la franquicia Jurassic Park. Se desarrolla en un parque temático de dinosaurios completamente funcional en Isla Nublar, pero la creación de una nueva especie híbrida, el Indominus Rex, desata el caos poniendo en peligro a todos los visitantes.",
                    "12 de junio de 2015",
                    Arrays.asList("Accion", "Aventura", "Ciencia Ficcion"),
                    124),

            new Pelicula(7, "Titanic",
                    "Dirigida por James Cameron, es un épico romance y drama basado en el hundimiento del RMS Titanic en 1912. Narra la historia de amor entre Jack Dawson, un joven artista de clase baja, y Rose DeWitt Bukater, una joven de la alta sociedad, quienes se conocen a bordo del lujoso buque durante su viaje inaugural.",
                    "19 de diciembre de 1997",
                    Arrays.asList("Drama", "Romance", "Historia"),
                    194),

            new Pelicula(8, "Avatar",
                    "Dirigida por James Cameron, es una epopeya de ciencia ficción ambientada en el planeta Pandora, donde los humanos buscan extraer un valioso mineral. Un marine paralítico llamado Jake Sully se integra a la tribu Na'vi mediante un avatar, pero termina enfrentándose a su propia especie para proteger el mundo alienígena.",
                    "18 de diciembre de 2009",
                    Arrays.asList("Ciencia Ficcion", "Aventura", "Accion"),
                    162),

            new Pelicula(9, "Shrek",
                    "Dirigida por Andrew Adamson y Vicky Jenson, es una comedia animada que parodia los cuentos de hadas. Sigue a Shrek, un ogro gruñón que vive solo en un pantano, hasta que su tranquilidad se ve interrumpida por criaturas de cuentos desterradas por el malvado Lord Farquaad. Shrek hace un trato para rescatar a la princesa Fiona y recuperar su hogar.",
                    "18 de mayo de 2001",
                    Arrays.asList("Animacion", "Comedia", "Aventura", "Fantasia"),
                    90),

            new Pelicula(10, "It",
                    "Dirigida por Andy Muschietti, basada en la novela de Stephen King. Ambientada en el pueblo de Derry, Maine, un grupo de niños autodenominados \"Los Perdedores\" se enfrentan a Pennywise, una entidad maligna que se manifiesta principalmente como un payaso y que se alimenta de los miedos de los niños, reapareciendo cada 27 años.",
                    "7 de septiembre de 2017",
                    Arrays.asList("Terror", "Sobrenatural", "Suspenso"),
                    135),

            new Pelicula(11, "Mi Villano Favorito",
                    "Dirigida por Pierre Coffin y Chris Renaud, es una comedia animada sobre Gru, un supervillano que planea robar la Luna para consolidarse como el mejor villano del mundo. Su plan se complica cuando adopta a tres niñas huérfanas para usarlas en su plan, pero terminan cambiando su vida para siempre.",
                    "9 de julio de 2010",
                    Arrays.asList("Animacion", "Comedia", "Familiar"),
                    95),

            new Pelicula(12, "Piratas del Caribe",
                    "Dirigida por Gore Verbinski, es la primera entrega de la saga. Presenta al excéntrico capitán Jack Sparrow mientras une fuerzas con el herrero Will Turner para rescatar a Elizabeth Swann, quien ha sido secuestrada por la tripulación del Perla Negra, un barco pirata maldito que navega bajo la luz de la luna convirtiéndose en esqueletos inmortales.",
                    "9 de julio de 2003",
                    Arrays.asList("Aventura", "Fantasia", "Accion"),
                    143),

            new Pelicula(13, "Buscando a Nemo",
                    "Dirigida por Andrew Stanton, es una película animada de Pixar. Narra la historia de Marlin, un pez payaso sobreprotector que cruza todo el océano junto a Dory, una pez cirujana con problemas de memoria, para rescatar a su hijo Nemo, quien fue capturado por un buceador en la Gran Barrera de Coral.",
                    "30 de mayo de 2003",
                    Arrays.asList("Animacion", "Aventura", "Comedia", "Familiar"),
                    100),

            new Pelicula(14, "Batman Dark Knight",
                    "Dirigida por Christopher Nolan, es la segunda entrega de la trilogía de Batman. Bruce Wayne/Batman enfrenta a su mayor amenaza: el Joker, un criminal psicópata y anarquista que busca sembrar el caos en Gotham City, poniendo a prueba los límites morales del héroe, el fiscal Harvey Dent y la sociedad.",
                    "18 de julio de 2008",
                    Arrays.asList("Accion", "Crimen", "Drama", "Suspenso"),
                    152),

            new Pelicula(15, "Lilo & Stitch",
                    "Dirigida por Dean DeBlois y Chris Sanders, es una película animada de Disney. Cuenta la historia de Lilo, una niña hawaiana solitaria que adopta a Stitch, una criatura alienígena genéticamente modificada que huye de la justicia galáctica. Juntos forman una familia poco convencional mientras aprenden sobre el significado del 'ohana (familia).",
                    "21 de junio de 2002",
                    Arrays.asList("Animacion", "Ciencia Ficcion", "Comedia", "Familiar"),
                    85)
    );

    private List<Pelicula> listaPost = new ArrayList<>();

    @GetMapping("/hello")
    public String getHello() {
        return "Hola Roger";
    }

    @GetMapping("/FiveYears")
    public String getFiveYears() {
        return "Mi nombre es Roger Flores Choque y de aquí a 5 años me veo ya culminado la carrera de Ing. de Sistemas, y continuar estudiando para sacar una maestria ya sea in Ing. de Software o Ciber Seguridad, esto podría cambiar con el tiempo pero por el momento esa es mi idea ademas de empezar a crear ya algunos proyectos por mi cuenta o con ayuda de amigos.";
    }

    @GetMapping("/peliculas/buscar/nombre")
    public Object getPeliculaByNombre(@RequestParam String nombre) {
        List<Pelicula> resultado = new ArrayList<>();
        resultado.addAll(listaOriginal.stream()
                .filter(p -> p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList()));
        resultado.addAll(listaPost.stream()
                .filter(p -> p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList()));
        if (resultado.isEmpty()) {
            return "No se encontró película con nombre: " + nombre;
        }
        return resultado;
    }

    @GetMapping("/peliculas/buscar/id/{id}")
    public Object getPeliculaById(@PathVariable int id) {
        for (Pelicula p : listaOriginal) {
            if (p.getId() == id) {
                return p;
            }
        }
        for (Pelicula p : listaPost) {
            if (p.getId() == id) {
                return p;
            }
        }
        return "No se encontró película con ID: " + id;
    }

    @GetMapping("/peliculas")
    public Object getPeliculas(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String genero,
            @RequestParam(required = false) Integer duracionMin,
            @RequestParam(required = false) Integer duracionMax,
            @RequestParam(required = false) String orden
    ) {
        List<Pelicula> resultado = listaOriginal.stream()
                .filter(p -> nombre == null || p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .filter(p -> genero == null || p.getGeneros().stream().anyMatch(g -> g.equalsIgnoreCase(genero)))
                .filter(p -> duracionMin == null || p.getDuracion() >= duracionMin)
                .filter(p -> duracionMax == null || p.getDuracion() <= duracionMax)
                .collect(Collectors.toList());

        if (resultado.isEmpty()) {
            return "No hay películas con esos filtros";
        }

        if (orden != null) {
            if (orden.equalsIgnoreCase("asc")) {
                resultado.sort((a, b) -> a.getDuracion() - b.getDuracion());
            } else if (orden.equalsIgnoreCase("desc")) {
                resultado.sort((a, b) -> b.getDuracion() - a.getDuracion());
            }
        }
        return resultado;
    }

    @GetMapping("/peliculas/post")
    public List<Pelicula> getPeliculasPost() {
        return listaPost;
    }

    @PostMapping("/peliculas")
    public Pelicula postPelicula(@RequestBody Pelicula pelicula) {
        pelicula.setId(nextId++);
        listaPost.add(pelicula);
        return pelicula;
    }

    @DeleteMapping("/peliculas/id/{id}")
    public String deletePeliculaById(@PathVariable int id) {
        for (int i = 0; i < listaOriginal.size(); i++) {
            if (listaOriginal.get(i).getId() == id) {
                Pelicula eliminada = listaOriginal.remove(i);
                return "Película eliminada: " + eliminada.getNombre() + " (ID: " + id + ")";
            }
        }
        for (int i = 0; i < listaPost.size(); i++) {
            if (listaPost.get(i).getId() == id) {
                Pelicula eliminada = listaPost.remove(i);
                return "Película eliminada: " + eliminada.getNombre() + " (ID: " + id + ")";
            }
        }
        return "No se encontró película con ID: " + id;
    }

    @DeleteMapping("/peliculas/nombre/{nombre}")
    public String deletePeliculaByNombre(@PathVariable String nombre) {
        for (int i = 0; i < listaOriginal.size(); i++) {
            if (listaOriginal.get(i).getNombre().equalsIgnoreCase(nombre)) {
                Pelicula eliminada = listaOriginal.remove(i);
                return "Película eliminada: " + eliminada.getNombre() + " (ID: " + eliminada.getId() + ")";
            }
        }
        for (int i = 0; i < listaPost.size(); i++) {
            if (listaPost.get(i).getNombre().equalsIgnoreCase(nombre)) {
                Pelicula eliminada = listaPost.remove(i);
                return "Película eliminada: " + eliminada.getNombre() + " (ID: " + eliminada.getId() + ")";
            }
        }
        return "No se encontró película con nombre: " + nombre;
    }

    @PutMapping("/peliculas/id/{id}")
    public String updatePeliculaById(@PathVariable int id, @RequestBody Pelicula nuevaPelicula) {
        for (int i = 0; i < listaOriginal.size(); i++) {
            if (listaOriginal.get(i).getId() == id) {
                nuevaPelicula.setId(id);
                listaOriginal.set(i, nuevaPelicula);
                return "Película actualizada: " + nuevaPelicula.getNombre() + " (ID: " + id + ")";
            }
        }
        for (int i = 0; i < listaPost.size(); i++) {
            if (listaPost.get(i).getId() == id) {
                nuevaPelicula.setId(id);
                listaPost.set(i, nuevaPelicula);
                return "Película actualizada: " + nuevaPelicula.getNombre() + " (ID: " + id + ")";
            }
        }
        return "No se encontró película con ID: " + id;
    }

    @PutMapping("/peliculas/nombre/{nombre}")
    public String updatePeliculaByNombre(@PathVariable String nombre, @RequestBody Pelicula nuevaPelicula) {
        for (int i = 0; i < listaOriginal.size(); i++) {
            if (listaOriginal.get(i).getNombre().equalsIgnoreCase(nombre)) {
                nuevaPelicula.setId(listaOriginal.get(i).getId());
                listaOriginal.set(i, nuevaPelicula);
                return "Película actualizada: " + nuevaPelicula.getNombre() + " (anterior: " + nombre + ")";
            }
        }
        for (int i = 0; i < listaPost.size(); i++) {
            if (listaPost.get(i).getNombre().equalsIgnoreCase(nombre)) {
                nuevaPelicula.setId(listaPost.get(i).getId());
                listaPost.set(i, nuevaPelicula);
                return "Película actualizada: " + nuevaPelicula.getNombre() + " (anterior: " + nombre + ")";
            }
        }
        return "No se encontró película con nombre: " + nombre;
    }
}