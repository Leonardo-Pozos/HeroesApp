package com.example.heroesapp.models

data class Heroe(val id: Int, val name: String, val descripcion: String, val img: String, val publisherId: Int) {
    companion object{
        val heroes = mutableListOf<Heroe>(
            Heroe(1, "Spider-Man", "Creado por Stan Lee y Steve Ditko para Marvel Comics. Su identidad secreta es Peter Parker, un joven huérfano que adquiere habilidades sobrehumanas después de ser mordido por una araña radiactiva, obteniendo la capacidad de trepar paredes, una fuerza y agilidad aumentada, y un \"sentido arácnido\" que le advierte del peligro. Spider-Man es conocido por su sentido de la responsabilidad, resumido en su lema: \"Con gran poder viene una gran responsabilidad.\"", "https://i.pinimg.com/564x/fd/62/2d/fd622dd8b02670a4fdefcdc981fa5a91.jpg", 1),
            Heroe(2, "Daredevil","Creado por Stan Lee y Bill Everett. Su identidad secreta es Matt Murdock, un abogado ciego que, tras un accidente con desechos radiactivos, pierde la vista pero adquiere sentidos sobrehumanos, como un \"radar\" que le permite percibir su entorno de manera extraordinaria. Murdock lucha contra el crimen en Hell's Kitchen, Nueva York, tanto en los tribunales como el vigilante Daredevil. Es conocido por su habilidad en el combate cuerpo a cuerpo, su valentía y su determinación de proteger a los inocentes.","https://i.pinimg.com/564x/7b/d4/71/7bd47141434c8014a4e98ef2c9d71f46.jpg",1),
            Heroe(3, "Thor", "Basado en el dios del trueno de la mitología nórdica. Creado por Stan Lee, Larry Lieber, y Jack Kirby, es el hijo de Odín, rey de Asgard, y tiene la responsabilidad de proteger tanto a su reino como a la Tierra. Thor es increíblemente fuerte y posee el martillo encantado Mjolnir, que le otorga el poder de controlar el trueno, volar y abrir portales entre dimensiones. A pesar de ser un dios, Thor es conocido por su sentido del honor y su lucha constante por proteger a la humanidad de amenazas cósmicas.", "https://i.pinimg.com/564x/4d/5a/e2/4d5ae2a7ae261c2d0613dadb063b84d3.jpg", 1),
            Heroe(4, "Iron Man", "Creado por Stan Lee, Larry Lieber, Don Heck, y Jack Kirby. Tony Stark es un multimillonario genio inventor y empresario. Stark sufre una grave lesión en el pecho tras ser capturado por terroristas, lo que lo lleva a crear una armadura avanzada para salvar su vida y escapar. A partir de ahí, utiliza su tecnología para combatir el crimen y proteger al mundo como Iron Man. La armadura de Iron Man le otorga fuerza sobrehumana, vuelo y un arsenal de armas avanzadas. Stark es conocido por su inteligencia, carisma y, a menudo, su lucha interna con sus defectos personales.", "https://i.pinimg.com/564x/d5/ad/0b/d5ad0b8fa58180cc2f8bbeebe5278fbf.jpg", 1),
            Heroe(5, "Wolverine", "Creado por Roy Thomas, Len Wein, y John Romita James \"Logan\" Howlett, y es miembro de los X-Men. Wolverine es conocido por su factor de curación acelerado, que le permite recuperarse de casi cualquier herida, y sus garras de adamantium, un metal indestructible que recubre su esqueleto. Además, tiene sentidos animales agudizados y una longevidad extendida. Wolverine es un luchador feroz con una personalidad ruda y a menudo solitaria, pero es leal a sus amigos y está comprometido con la defensa de los inocentes, aunque a veces lucha con su naturaleza salvaje.", "https://i.pinimg.com/736x/9c/57/33/9c5733948ecdc30540321e31b977dce8.jpg", 1),
            Heroe(6, "Hulk", "Creado por Stan Lee y Jack Kirby. Su identidad secreta es el Dr. Bruce Banner, un científico brillante que, tras un accidente con radiación gamma, se transforma en Hulk, una enorme criatura verde con una fuerza sobrehumana e imparable. Cada vez que Banner se enoja o está bajo estrés extremo, se convierte en Hulk, cuya fuerza aumenta proporcionalmente a su furia.", "https://i.pinimg.com/564x/4e/92/b9/4e92b97542824b101b991fab083361fb.jpg", 1),
            Heroe(7, "Nova", "Creado por Marv Wolfman y John Buscema. Su identidad secreta es Richard Rider, un adolescente que es elegido por el moribundo Rhomann Dey, miembro de la fuerza intergaláctica conocida como el Cuerpo Nova, para heredar sus poderes y responsabilidades. Como Nova, Rider obtiene habilidades sobrehumanas, como fuerza, velocidad y resistencia aumentadas, vuelo, y la capacidad de generar y manipular energía. Ademas, el casco Nova le otorga vasto conocimiento y comunicación con la base de datos del Cuerpo Nova. Nova actúa como protector de la Tierra y el universo, enfrentándose a amenazas cósmicas mientras equilibra su vida personal en la Tierra.","https://i.pinimg.com/564x/1b/1b/51/1b1b51223837a74434f48d5e30ed00c5.jpg", 1),
            Heroe(8, "Punisher", "Creado por Gerry Conway, John Romita Sr., y Ross Andru. Frank Castle, un ex marine cuya familia es asesinada por la mafia. En busca de venganza, Castle se convierte en The Punisher, un vigilante implacable que lucha contra el crimen utilizando métodos extremos, incluyendo tortura, armas de fuego y asesinatos. A diferencia de otros superhéroes, The Punisher no sigue un código moral estricto y está dispuesto a matar a criminales para cumplir su misión. Su entrenamiento militar, habilidades de combate y arsenal de armas lo convierten en una fuerza temible. Castle es conocido por su brutalidad y su cruzada solitaria contra el crimen organizado.", "https://i.pinimg.com/564x/b9/51/bf/b951bfb9bd8db6ed9067a3626923431d.jpg", 1),
            Heroe(9, "Cyclops", "Creado por Stan Lee y Jack Kirby. Su identidad secreta es Scott Summers, uno de los miembros fundadores de los X-Men. Cíclope tiene la capacidad de disparar poderosos rayos de energía óptica de sus ojos, pero debido a un accidente en su juventud, no puede controlar este poder. Para contenerlo, debe usar un visor o gafas especiales de rubí que le permiten dirigir sus ráfagas. Como líder de los X-Men, Cíclope es conocido por su disciplina, sentido de responsabilidad y su compromiso con la visión del Profesor Xavier de lograr la paz entre mutantes y humanos.", "https://i.pinimg.com/564x/40/a6/08/40a60863e608ec058857171af85d546d.jpg", 1),
            Heroe(10, "The Thing", "Creado por Stan Lee y Jack Kirby. Su nombre real es Ben Grimm, un miembro de los Cuatro Fantásticos. Después de ser expuesto a radiación cósmica durante una misión espacial, Ben se transforma en The Thing, una criatura con piel rocosa de color naranja, dotada de una fuerza y resistencia sobrehumanas. A pesar de su apariencia monstruosa, The Thing conserva su buen corazón y sentido del humor. Ben lucha con la aceptación de su nueva forma, pero sigue siendo un héroe valiente y decidido.", "https://i.pinimg.com/564x/10/14/38/101438cc609133414c11e442842081eb.jpg", 1),
            Heroe(21, "Silver Surfer", "Creado por Jack Kirby. Su nombre real es Norrin Radd, un antiguo astrónomo del planeta Zenn-La. Para salvar su mundo de la destrucción por el devorador de planetas Galactus, Norrin se ofrece como su heraldo, transformándose en el Silver Surfer. Recubierto de una piel plateada y montado en una tabla de surf que le permite viajar a velocidades cósmicas, el Silver Surfer posee el \"Poder Cósmico\", que le otorga una fuerza inmensa, la capacidad de manipular energía y la invulnerabilidad. A pesar de su pasado como heraldo de Galactus, Silver Surfer se rebela y se convierte en un defensor de la justicia, vagando por el universo en busca de redención y paz.", "https://i.pinimg.com/564x/f6/c6/e3/f6c6e32da27f9b5b8763e736c37651f3.jpg", 1),
            Heroe(22, "Ghost Rider", "Creado por Roy Thomas, Gary Friedrich, y Mike Ploog. El Ghost Rider más conocido es Johnny Blaze, un motorista que, para salvar la vida de su padre adoptivo, hace un pacto con el demonio Mephisto. Como resultado, Johnny se transforma en el Ghost Rider, un vengador sobrenatural con una apariencia esquelética envuelta en llamas. Monta una motocicleta infernal y tiene el poder de controlar el fuego del infierno, lo que le permite crear y manipular llamas, incluso su \"fuego del castigo\", que puede juzgar y quemar las almas de los malvados. Aunque maldecido con este destino, Ghost Rider lucha para proteger a los inocentes y castigar a los culpables, mientras busca liberarse de la influencia demoníaca.", "https://i.pinimg.com/564x/1a/86/5f/1a865fe6ea2a6a9148c5d37f593637ac.jpg", 1),
            Heroe(23, "Moon Knight", "Creado por Doug Moench y Don Perlin. Marc Spector es un ex mercenario que, tras ser traicionado y dado por muerto en Egipto, es resucitado por el dios egipcio Khonshu. A cambio, Marc se convierte en el avatar de Khonshu en la Tierra, asumiendo la identidad de Moon Knight. Tiene habilidades de combate avanzadas, una fuerza aumentada bajo la luz de la luna, y utiliza una variedad de armas especializadas. Moon Knight es conocido por su enfoque brutal en la lucha contra el crimen y sus múltiples identidades, incluyendo las de Marc Spector, el millonario Steven Grant, y el taxista Jake Lockley, lo que refleja sus luchas internas con un trastorno de identidad disociativa. Es un héroe oscuro y complejo, con un enfoque único en la justicia y la venganza.", "https://i.pinimg.com/564x/c7/95/c9/c795c966edc190630a206c832caa2e64.jpg", 1),
            Heroe(24, "Human Torch", "Creado por Stan Lee y Jack Kirby. Su identidad secreta es Johnny Storm, un miembro de los Cuatro Fantásticos. Después de ser expuesto a radiación cósmica durante una misión espacial, Johnny adquiere la habilidad de prenderse en llamas a voluntad, lo que le permite volar y proyectar fuego. También puede controlar el calor y lanzar potentes ráfagas de fuego. Su característica frase es \"¡Llama encendida!\" (\"Flame on!\") cuando activa sus poderes. Johnny es conocido por su carácter carismático y a veces impulsivo, siendo el miembro más joven y entusiasta del equipo, pero también un héroe valiente que siempre está dispuesto a proteger a sus seres queridos y al mundo.", "https://i.pinimg.com/564x/c0/5e/06/c05e06113111a609bc1319bb1117ab02.jpg", 1),
            Heroe(29, "Captain America", "Creado por Joe Simon y Jack Kirby. Steve Rogers es un joven débil que, durante la Segunda Guerra Mundial, se ofrece como voluntario para un experimento del gobierno que lo transforma en un supersoldado. Con fuerza, agilidad y resistencia mejoradas al máximo de las capacidades humanas, Steve adopta la identidad de Capitán América y lucha contra las fuerzas del Eje. A pesar de quedar congelado en el hielo y despertarse décadas después, Capitán América sigue siendo un símbolo de valentía, justicia y liderazgo, defendiendo la libertad y los ideales de su nación como uno de los líderes de los Vengadores.", "https://i.pinimg.com/564x/60/7b/15/607b15e9eef20f404da3b4fecf055993.jpg", 1),
            Heroe(30, "Black Panter", "Creado por Stan Lee y Jack Kirby. Su nombre real es T'Challa, el rey de la nación africana ficticia de Wakanda, un país avanzado tecnológicamente gracias a su abundancia de vibranium, un metal raro y poderoso. Como Pantera Negra, T'Challa posee habilidades sobrehumanas otorgadas por la hierba en forma de corazón, que le otorgan fuerza, velocidad, agilidad y sentidos mejorados. Además, es un experto en combate cuerpo a cuerpo, estrategia y ciencia. Pantera Negra es conocido por ser un líder justo y protector de su pueblo, así como un miembro fundamental de los Vengadores. Su legado va más allá de ser un superhéroe, representando el orgullo, la tradición y la defensa de su nación y del mundo.", "https://i.pinimg.com/564x/5d/fe/9c/5dfe9c117d5a0a168c824cccf0d9b85a.jpg", 1),
            Heroe(33, "Star-lord", "Creado por Steve Englehart y Steve Gan. Su nombre real es Peter Quill, un aventurero mitad humano, mitad alienígena. Después de ser secuestrado por los piratas espaciales Ravagers de joven, Peter crece para convertirse en el líder de los Guardianes de la Galaxia. Como Star-Lord, utiliza su ingenio, habilidades en combate y su equipo tecnológico, que incluye pistolas elementales y un casco avanzado. Aunque a menudo es sarcástico y rebelde, Star-Lord es un líder valiente que lucha por proteger el universo de amenazas cósmicas. Su personalidad desenfadada y su amor por la música de los 80 lo hacen un personaje único y carismático, fundamental en la defensa de la galaxia.", "https://i.pinimg.com/564x/30/a3/13/30a3134997932a100380135c2fe8b74a.jpg", 1),
            Heroe(34, "Rcoket Raccon", "Creado por Bill Mantlo y Keith Giffen. Es un mapache antropomórfico y altamente inteligente, con habilidades excepcionales en combate, tácticas militares y manejo de armas. Aunque pequeño en tamaño, Rocket es un guerrero feroz y un genio en ingeniería, capaz de crear armas y dispositivos avanzados. Es uno de los miembros principales de los Guardianes de la Galaxia y conocido por su actitud sarcástica, su temperamento explosivo y su lealtad hacia sus amigos, en especial hacia Groot, su compañero inseparable. A pesar de su exterior rudo y su actitud de no necesitar a nadie, Rocket demuestra una profunda capacidad de cuidar a los que ama y luchar por lo que es justo.", "https://i.pinimg.com/736x/90/85/07/908507ead58d3ddad342a6a88213a8a5.jpg", 1),
            Heroe(35, "Groot", "Creado por Stan Lee, Larry Lieber y Jack Kirby. Es un ser alienígena con forma de árbol que pertenece a la raza Flora Colossus, del planeta X. Aunque su vocabulario está limitado a la frase \"Yo soy Groot\", su entonación y expresiones faciales permiten que sus amigos lo entiendan perfectamente. Groot posee una fuerza sobrehumana, la capacidad de regenerarse y la habilidad de controlar su tamaño, lo que le permite crecer a grandes proporciones o regenerarse a partir de una pequeña rama. Es un miembro clave de los Guardianes de la Galaxia y a menudo actúa como protector de su equipo, especialmente de su mejor amigo Rocket Raccoon. Groot es conocido por su nobleza, valentía y su disposición a sacrificarse por el bien de los demás.", "https://i.pinimg.com/564x/1d/57/07/1d570778160f278fbfd40d76955ba5c1.jpg", 1),
            Heroe(36, "Deadpool", "Creado por Rob Liefeld y Fabian Nicieza. Su nombre real es Wade Wilson, un mercenario que adquiere habilidades de curación acelerada a través de un experimento del programa Arma X, el mismo que creó a Wolverine. Deadpool es conocido por su carácter irreverente, su sentido del humor negro, y su tendencia a romper la \"cuarta pared\", interactuando directamente con los lectores. Además de su factor curativo, que lo hace casi inmortal, es un experto en combate cuerpo a cuerpo y manejo de armas. Aunque a menudo trabaja como mercenario y se le considera un antihéroe, Deadpool a veces lucha por el bien, aunque sus métodos suelen ser violentos y caóticos.", "https://i.pinimg.com/564x/7d/db/62/7ddb622916a82560d78ab6f1c3291198.jpg", 1),
            Heroe(41, "Beta Ray Bill", "Creado por el legendario escritor y artista Walt Simonson. Es un guerrero extraterrestre de la raza Korbinita, conocido por su increíble fuerza, honor y valentía. Beta Ray Bill se convierte en un aliado cercano de Thor cuando, durante una batalla, demuestra ser digno de empuñar el poderoso martillo Mjolnir. Impresionado por su nobleza, Odin forja un nuevo martillo llamado Stormbreaker para Beta Ray Bill, que le otorga poderes similares a los de Thor, incluyendo la capacidad de controlar el trueno, volar y una fuerza sobrehumana. Beta es un héroe con un fuerte sentido del deber y un corazón compasivo que lucha incansablemente para proteger a su pueblo y a aquellos en peligro.", "https://i.pinimg.com/564x/ce/91/68/ce9168e17c6bc32b8ee3b3b60d5aa63b.jpg", 1),
            Heroe(42, "Doctor Strange", "Creado por Stan Lee y Steve Ditko. Su nombre real es Stephen Strange, un talentoso pero arrogante neurocirujano que, tras un accidente automovilístico que daña sus manos, busca una cura y termina encontrando a \"El Anciano\", un místico que lo entrena en las artes mágicas. Con el tiempo, Strange se convierte en el Hechicero Supremo, el protector de la Tierra contra amenazas mágicas y sobrenaturales. Utiliza una amplia gama de poderes místicos, como la manipulación de energías mágicas, teletransportación y la creación de escudos de protección. Es conocido por usar artefactos poderosos como el Ojo de Agamotto y la Capa de Levitación. Doctor Strange es un héroe sabio y decidido, encargado de defender el equilibrio cósmico.", "https://i.pinimg.com/564x/e4/40/44/e4404487f0d3ceef3f40dc6bbb082c51.jpg", 1),
            Heroe(11, "Batman", "Creado por Bob Kane y Bill Finger. Su identidad secreta es Bruce Wayne, un multimillonario de Gotham City que, tras presenciar el asesinato de sus padres cuando era niño, jura combatir el crimen. Sin poderes sobrehumanos, Batman utiliza su intelecto, habilidades de combate, tecnología avanzada y recursos financieros para luchar contra sus villanos. Es un maestro detective y estratega, conocido por su enfoque implacable en la justicia. Su símbolo, un murciélago, inspira miedo en los criminales, mientras que su código moral le impide matar, lo que lo convierte en un héroe complejo y enigmático.", "https://i.pinimg.com/564x/96/81/00/968100d2d047b3e9a186780cc2f3b264.jpg", 2),
            Heroe(12, "Superman", "Creado por Jerry Siegel y Joe Shuster. Su nombre verdadero es Kal-El, un extraterrestre del planeta Krypton que fue enviado a la Tierra antes de que su planeta explotara. Criado como Clark Kent por una familia en Kansas, descubre que posee poderes sobrehumanos debido a la radiación del sol amarillo de la Tierra. Entre sus habilidades se encuentran la superfuerza, vuelo, visión de rayos láser, invulnerabilidad y supervelocidad. Como Superman, protege al mundo de amenazas poderosas mientras mantiene su identidad secreta como periodista. Es conocido por su inquebrantable sentido de la justicia, bondad y su papel como el símbolo de la esperanza.", "https://i.pinimg.com/736x/dd/d7/dd/ddd7dd14dbea140b6e3ec09cc5acbd8e.jpg", 2),
            Heroe(13, "Red hood", "Creado por Bill Finger, Sheldon Moldoff y Bob Kane. Su identidad más conocida es Jason Todd, el segundo Robin, quien fue asesinado por el Joker y posteriormente resucitado a través de los pozos de Lázaro. Tras su regreso, Jason adopta la identidad de Red Hood, un alias que alguna vez usó el Joker. Red Hood opera como un vigilante violento que utiliza métodos letales para luchar contra el crimen, en contraste con la estricta moral de Batman. Aunque es un exaliado de Batman, sus métodos brutales y su enfoque implacable a menudo lo ponen en conflicto con la Batfamilia. Jason es un personaje complejo, marcado por su resentimiento hacia su antiguo mentor y su búsqueda de justicia a su manera.", "https://i.pinimg.com/564x/8a/e2/d0/8ae2d0fd035ff1a73c6de921610487c2.jpg", 2),
            Heroe(14, "Green Lantern", "Creado por John Broome y Gil Kane. Hal Jordan es un piloto de pruebas que se convierte en el primer humano en ser elegido por los Guardianes del Universo para portar un anillo de poder del Green Lantern Corps, una fuerza intergaláctica encargada de mantener el orden y la justicia en el cosmos. El anillo de Hal le otorga la capacidad de crear construcciones de energía verde basadas en su fuerza de voluntad y creatividad. Como Green Lantern, Hal es valiente, decidido y conocido por su habilidad para superar el miedo, siendo una figura clave tanto en la Tierra como en el universo.", "https://i.pinimg.com/564x/a2/96/68/a29668d508f9adc062910479fbdd5490.jpg", 2),
            Heroe(15, "Aquaman", "Creado por Paul Norris y Mort Weisinger. Su nombre verdadero es Arthur Curry, y es el rey de Atlantis, un poderoso reino submarino. Como mitad humano y mitad atlante, Aquaman tiene habilidades sobrehumanas, como la capacidad de respirar bajo el agua, nadar a velocidades increíbles, y comunicarse telepáticamente con la vida marina. También posee una fuerza y resistencia sobrehumanas, además de empuñar el legendario Tridente de Atlantis. Aunque a menudo ha sido subestimado, Aquaman es un héroe formidable que lucha por proteger tanto a la Tierra como a los océanos, defendiendo la paz entre los humanos y los atlantes.", "https://i.pinimg.com/564x/a3/2e/f9/a32ef9288385399bcde6ed39b45e209f.jpg", 2),
            Heroe(16, "Shazam", "Creado por C.C. Beck y Bill Parker. Su identidad secreta es Billy Batson, un adolescente que puede transformarse en el héroe adulto conocido como Shazam al pronunciar la palabra mágica \"Shazam\". Cada letra de esta palabra representa a una de las deidades y héroes de la mitología que le otorgan sus poderes: Salomón (sabiduría), Hércules (fuerza), Atlas (resistencia), Zeus (poder), Aquiles (valentía) y Mercurio (velocidad). Como Shazam, Billy tiene habilidades sobrehumanas similares a las de Superman, incluyendo superfuerza, vuelo y la capacidad de disparar rayos mágicos. Shazam es conocido por su juventud y su carácter alegre, contrastando con su imponente forma adulta y sus poderes extraordinarios.", "https://i.pinimg.com/564x/21/ce/d1/21ced1a2d8ea7df48be7dfb4cc122c71.jpg", 2),
            Heroe(17, "Flash", "Creado por Gardner Fox y Harry Lampert. Su identidad secreta Barry Allen es un forense que obtiene supervelocidad después de ser alcanzado por un rayo y bañado en productos químicos. Esta velocidad sobrehumana le permite moverse, pensar y reaccionar a velocidades increíbles, así como viajar en el tiempo y a través de dimensiones. Flash utiliza sus habilidades para combatir el crimen y proteger Central City, a menudo enfrentándose a villanos con poderes similares y tratando de equilibrar su vida como héroe con su trabajo y relaciones personales.", "https://i.pinimg.com/564x/58/89/17/5889170076ca5cad448308c5422077fb.jpg", 2),
            Heroe(18, "Martian Manhunter", "Creado por Joseph Samachson y Jack Kirby. Su nombre verdadero es J'onn J'onzz, un extraterrestre del planeta Marte que llega a la Tierra después de la destrucción de su hogar. Martian Manhunter posee una variedad de habilidades sobrehumanas, incluyendo fuerza, vuelo, invisibilidad, telepatía y la capacidad de cambiar de forma. Su aspecto habitual es de una figura verde con una capa roja y un traje azul con una cruz verde. Es conocido por su sabiduría, su sentido de la justicia y su papel como uno de los miembros fundadores de la Liga de la Justicia. Aunque a menudo lucha con su sentido de pérdida y soledad, es un aliado valiente y poderoso en la lucha contra el crimen y las amenazas cósmicas.", "https://i.pinimg.com/564x/d7/e1/64/d7e164f6be8c8cc9043e06d81e3f1727.jpg", 2),
            Heroe(19, "Constantine", "Creado por Alan Moore, Stephen R. Bissette y John Totleben. Es un detective y mago que trabaja en el ámbito de lo oculto y lo sobrenatural. Constantine es conocido por su actitud cínica, su astucia y su habilidad para manipular las artes oscuras. A menudo se encuentra lidiando con demonios, espíritus y fuerzas sobrenaturales mientras enfrenta sus propios demonios personales. Constantine es un personaje complejo y fascinante, conocido por su ingenio y su capacidad para resolver problemas mágicos con métodos poco ortodoxos.", "https://i.pinimg.com/564x/fa/7a/e7/fa7ae71764bb585eb9e9481954518ff0.jpg", 2),
            Heroe(20, "Wonder Woman", "Creada por William Moulton Marston y H.G. Peter. Su nombre real es Diana Prince, y es la princesa de las Amazonas, una raza de mujeres guerreras que habita en la isla de Themyscira. Diana es conocida por su gran fuerza, agilidad, y habilidades de combate. Posee varios artefactos mágicos, incluyendo el Lazo de la Verdad, que obliga a los que lo tocan a decir la verdad, y las Bracelets of Submission, que son casi indestructibles. Además, tiene una conexión con los dioses griegos que le otorga habilidades adicionales. Como Wonder Woman, lucha por la justicia, la igualdad y la paz, y es un símbolo de empoderamiento y valentía.", "https://i.pinimg.com/564x/15/dd/5d/15dd5d3c34b0291305dd73728422cacd.jpg", 2),
            Heroe(25, "Doctor Fate", "Creado por Gardner Fox y Howard Sherman. Kent Nelson descubre el casco místico de Nabu, un antiguo hechicero y Señor del Orden, que le otorga vastos poderes mágicos y lo convierte en Doctor Fate, un defensor de la justicia y el equilibrio entre el bien y el mal. Entre sus habilidades están el control de la magia, vuelo, invulnerabilidad y la manipulación del tiempo y el espacio. Doctor Fate también utiliza un amuleto y una capa mágica que le proporcionan habilidades adicionales. Como uno de los hechiceros más poderosos del universo DC, es conocido por su sabiduría, sus habilidades místicas y su compromiso de proteger el orden cósmico, aunque a menudo lucha con la influencia de Nabu sobre su vida.", "https://i.pinimg.com/564x/09/11/79/0911793e70c359b2222c907253b5435b.jpg", 2),
            Heroe(26, "Zatanna", "Creada por Gardner Fox y Murphy Anderson. Es hija del famoso mago Giovanni Zatara y heredera de una poderosa tradición mágica. Zatanna utiliza la magia mediante la pronunciación de encantamientos al revés, lo que le permite realizar una amplia gama de hechizos, desde controlar los elementos hasta alterar la realidad. Además de sus habilidades mágicas, es una talentosa ilusionista y escapista. Zatanna es miembro recurrente de la Liga de la Justicia y uno de los hechiceros más poderosos del universo DC. Es conocida por su carisma, valentía y lealtad, y frecuentemente actúa como protectora del equilibrio místico, enfrentándose a amenazas sobrenaturales y demoníacas.", "https://i.pinimg.com/564x/a6/b2/20/a6b220f3ce9afb24ad4974b94cd2817f.jpg", 2),
            Heroe(27, "Supergirl", "Creada por Otto Binder y Al Plastino. Su nombre real es Kara Zor-El, la prima de Superman, y al igual que él, proviene del planeta Krypton. Tras la destrucción de su mundo, Kara llega a la Tierra, donde desarrolla los mismos poderes que su primo, incluyendo superfuerza, vuelo, visión de calor y aliento helado, gracias a la radiación del sol amarillo. Aunque tiene habilidades similares a las de Superman, Supergirl enfrenta su propio viaje de adaptación y crecimiento, lidiando con el hecho de ser una de las últimas sobrevivientes de Krypton. Es conocida por su valentía, su corazón compasivo y su deseo de proteger a los inocentes, siendo una figura clave en el universo de DC como heroína y defensora de la justicia.", "https://i.pinimg.com/564x/c9/e7/ca/c9e7ca75dd94b408c54a657a5f4f7bd0.jpg", 2),
            Heroe(28, "Nightwing", "Creado por Bob Kane y Bill Finger. Su identidad secreta es Dick Grayson, el primer Robin y pupilo de Batman. Tras crecer y dejar atrás su rol como Robin, Dick adopta la identidad de Nightwing para luchar contra el crimen de manera independiente. A pesar de seguir utilizando las habilidades y el entrenamiento que aprendió de Batman, Nightwing es más optimista y tiene un enfoque más equilibrado hacia la justicia. Es un experto en artes marciales, acrobacias y un excelente líder. Como protector de la ciudad de Blüdhaven, Nightwing se ha consolidado como un héroe con su propio estilo, siendo un pilar importante en la Batfamilia y en el universo de DC.", "https://i.pinimg.com/736x/a3/45/77/a345771afc0c1c192a7376232ad859a5.jpg", 2),
            Heroe(31, "Beast boy", "Creado por Arnold Drake y Bob Brown. Su nombre real es Garfield Logan, un joven con la capacidad de transformarse en cualquier animal que pueda imaginar, desde un tigre hasta un pájaro. Esta habilidad le permite adquirir las características físicas y habilidades de esos animales, como fuerza, agilidad y vuelo. Originalmente un miembro de los Doom Patrol, Beast Boy se une a los Jóvenes Titanes, donde se destaca por su personalidad humorística y su lealtad al equipo. A pesar de su actitud desenfadada, es un héroe valiente y capaz, comprometido con la lucha por la justicia y la protección de sus amigos.", "https://i.pinimg.com/564x/14/35/e7/1435e79952a230d9a6df0c41b7c66740.jpg", 2),
            Heroe(32, "Hawkman", "Creado por Gardner Fox y Dennis Neville. Su nombre real es Carter Hall, un arqueólogo que descubre que es la reencarnación de un antiguo príncipe egipcio, Khufu. Carter Hall utiliza una armadura y alas hechas de metal Nth, que le permiten volar y le otorgan una fuerza y resistencia sobrehumanas. Como Hawkman, lucha contra el crimen y las amenazas con su habilidad en el combate y su conocimiento de la historia y la arqueología. Su historia está marcada por temas de reencarnación y destino, ya que a lo largo de varias vidas ha luchado contra villanos y amenazas en diferentes épocas. Es conocido por su valentía, su tenacidad y su conexión con el pasado antiguo.", "https://i.pinimg.com/564x/ee/05/74/ee057449ef9e6886fba47b6009837819.jpg", 2),
            Heroe(37, "Hawkgirl", "Creada por Gardner Fox y Dennis Neville. Su identidad más conocida es Shayera Hol. Al igual que Hawkman, Hawkgirl utiliza alas hechas de metal Nth, que le permiten volar, y posee una fuerza y resistencia sobrehumanas. Es una experta en combate cuerpo a cuerpo y maneja armas antiguas, como su característico mazo. Shayera también es la reencarnación de una sacerdotisa egipcia, lo que le añade una conexión mística con el pasado. Es conocida por su carácter decidido, su valentía y su habilidad en el campo de batalla, además de ser un miembro fundamental de la Liga de la Justicia.", "https://i.pinimg.com/564x/b3/e4/77/b3e47776e68609ef3af2415034d67c98.jpg", 2),
            Heroe(38, "Flash", "Creado por John Broome y Carmine Infantino, Wally comienza su carrera como Kid Flash, el joven compañero de Barry Allen, después de haber sido expuesto a un accidente similar al de Barry, que le otorga acceso a la Fuerza de Velocidad. Cuando Barry Allen aparentemente muere, Wally toma el rol de Flash y se convierte en el héroe velocista principal. Como Flash, Wally es uno de los héroes más rápidos y llega a ser considerado el más veloz de todos los velocistas, incluso superando a Barry en ocasiones. Es miembro clave de la Liga de la Justicia y tiene un fuerte sentido del humor y compañerismo. Su viaje está lleno de desafíos personales, pero siempre se muestra como un héroe comprometido, dedicado a proteger a sus seres queridos y al mundo.", "https://i.pinimg.com/736x/e2/8a/07/e28a07042c95fd1fd4447ba11a5ce927.jpg", 2),
            Heroe(39, "Green Lantern", "Creado por Ron Marz y Darryl Banks. Kyle se convierte en Green Lantern después de que todos los Guardianes del Universo, excepto uno, son destruidos y la mayor parte del Cuerpo de Linternas Verdes desaparece. Ganthet, el último Guardián, elige a Kyle de manera inesperada para portar el último anillo de poder. Kyle es conocido por su creatividad, ya que trabaja como artista gráfico, lo que lo distingue del resto de los Linternas Verdes, quienes suelen ser más militares en su enfoque. Su imaginación le permite crear constructos únicos y detallados con su anillo. A pesar de su inexperiencia inicial, Kyle demuestra ser un Linterna muy capaz, enfrentándose a grandes amenazas y protegiendo el universo.", "https://i.pinimg.com/564x/61/ab/e9/61abe9ac06d76166b8610dc61e3d8c6f.jpg", 2),
            Heroe(40, "Raven", "Creada por Marv Wolfman y George Pérez. Es hija de la humana Arella y del demonio interdimensional Trigon, lo que le otorga una herencia tanto humana como demoníaca. Raven es una poderosa hechicera, capaz de manipular las emociones de los demás, proyectar su alma en forma de energía oscura y realizar magia mística. Su habilidad más distintiva es controlar y usar la \"energía de las sombras\" para teletransportarse, crear campos de fuerza o atacar a sus enemigos. Es una de los miembros fundadores de los Jóvenes Titanes y lucha constantemente para mantener bajo control su lado oscuro y los poderes demoníacos que hereda de su padre. Suele ser reservada y tranquila, pero es extremadamente leal a sus amigos.", "https://i.pinimg.com/564x/0e/b6/25/0eb625a10cb955ff8139cc4725d013a3.jpg", 2),
            Heroe(43, "Green Arrow", "Creado por Mort Weisinger y George Papp. Su nombre real es Oliver Queen, un millonario filántropo y experto arquero que, tras quedar varado en una isla desierta, perfecciona sus habilidades con el arco y las flechas. Al regresar a la civilización, decide usar sus nuevas habilidades para luchar contra el crimen en Star City, asumiendo la identidad de Green Arrow. Es conocido por su puntería excepcional, su uso de flechas trucadas, y su enfoque como un héroe callejero que combate la injusticia social y política. Aunque no tiene superpoderes, su habilidad en el combate y su fuerte sentido de la justicia lo convierten en un miembro valioso de la Liga de la Justicia.", "https://i.pinimg.com/564x/b1/d0/b0/b1d0b04a7f975f033aa42a6b846a7cbb.jpg", 2),
            Heroe(44, "Batgirl", "Creada por Bill Finger y Sheldon Moldoff. Su identidad secretas es Barbara Gordon, hija del comisionado de policía de Gotham, Jim Gordon. Barbara asume el manto de Batgirl para luchar contra el crimen junto a Batman y Robin. Es una experta en artes marciales, una detective habilidosa, y posee una gran inteligencia, lo que la convierte en una vigilante eficaz en Gotham City. A lo largo de los años, ha sido un símbolo de perseverancia, inteligencia y valentía en el universo de Batman.", "https://i.pinimg.com/564x/5b/04/d0/5b04d0ad88976be23ca78ee8a7bda7d5.jpg", 2)
        )
    }
}