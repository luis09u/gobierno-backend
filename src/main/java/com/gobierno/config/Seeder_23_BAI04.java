package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(23)
public class Seeder_23_BAI04 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_23_BAI04(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI04")) {
            System.out.println("Iniciando carga de datos de capacidad y disponibilidad: BAI04...");
            cargarBAI04();
            System.out.println("BAI04 (Gestión de la Disponibilidad y Capacidad) cargado exitosamente.");
        }
    }

    private void cargarBAI04() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE ALTA DISPONIBILIDAD)
        // ==========================================
        ProcesoCobit bai04 = new ProcesoCobit();
        bai04.setIdProceso("BAI04");
        bai04.setDominio("Construir, Adquirir e Implementar");
        bai04.setAreaPrioritaria("Modelo Core de COBIT");
        bai04.setNombreProceso("Gestionar la disponibilidad y la capacidad");
        bai04.setDescripcionProceso("Evaluar, modelar y planificar el rendimiento continuo junto con la capacidad de almacenamiento y procesamiento de los servicios tecnológicos, garantizando que la infraestructura soporte las operaciones actuales y las futuras exigencias del mercado sin interrupciones.");
        bai04.setPropositoProceso("Prevenir la caída de los servicios de movilidad conectada debido a sobrecargas en los servidores centrales, asegurando que la arquitectura tecnológica crezca de forma coordinada con las ventas de automóviles y soporte las actualizaciones masivas de software a nivel global.");

        bai04.setMetasAlineamiento("AG07: Seguridad, confiabilidad e integridad ininterrumpida de la infraestructura de procesamiento de datos.\nAG08: Habilitación y soporte continuo a los procesos comerciales mediante tecnología.");
        bai04.setMetasEmpresariales("EG06: Continuidad operativa y disponibilidad permanente de los servicios frente al consumidor final.\nEG01: Portafolio de productos comerciales competitivos y sumamente confiables.");
        bai04.setMetricasModelo("Métrica 1: Porcentaje de tiempo de actividad ininterrumpida de la red principal de distribución de software vehicular.\nMétrica 2: Frecuencia de incidentes operativos o caídas del sistema causados directamente por el agotamiento del espacio de almacenamiento o la saturación de los procesadores.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES PREVENTIVAS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai04);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI04.01");
        pract01.setNombrePractica("Evaluar la disponibilidad y la capacidad actual");
        pract01.setDescripcionPractica("Monitorear el consumo de los recursos informáticos en tiempo real para conocer los límites operativos exactos de la organización.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Realizar pruebas de esfuerzo sobre la red de distribución de datos para identificar el límite máximo de vehículos que pueden descargar actualizaciones de manera simultánea sin degradar la velocidad del sistema."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Implementar sensores de alerta temprana que notifiquen a los administradores de infraestructura inmediatamente cuando el consumo de memoria alcance el ochenta por ciento, permitiendo tomar acciones correctivas antes de un colapso."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI04.02");
        pract02.setNombrePractica("Modelar y pronosticar la demanda futura");
        pract02.setDescripcionPractica("Utilizar los planes de crecimiento de la empresa para calcular qué cantidad de servidores y ancho de banda serán necesarios en los próximos años.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Analizar las proyecciones de ventas anuales proporcionadas por la gerencia comercial con el fin de calcular la ampliación requerida en las bases de datos de telemetría."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Construir modelos matemáticos que simulen el comportamiento de la red durante el lanzamiento de una nueva generación de automóviles conectados."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI04.03");
        pract03.setNombrePractica("Planificar las inversiones en capacidad tecnológica");
        pract03.setDescripcionPractica("Estructurar los proyectos de compra o arrendamiento de nuevos equipos informáticos de manera oportuna, asegurando que estén operativos justo antes de que la demanda supere la capacidad actual.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Elaborar y presentar ante la dirección financiera un plan de expansión de servidores respaldado por los modelos de pronóstico de ventas."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Configurar rutinas de escalabilidad automática en los centros de datos, lo cual significa que el sistema contratará temporalmente mayor potencia de procesamiento sin intervención humana ante picos inesperados de tráfico."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai04.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai04); raci1.setPracticaGestion("BAI04.01"); raci1.setRolOrganizacional("Director de Operaciones Tecnológicas"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai04); raci2.setPracticaGestion("BAI04.02"); raci2.setRolOrganizacional("Gestor de Capacidad y Rendimiento de Infraestructura"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai04); raci3.setPracticaGestion("BAI04.03"); raci3.setRolOrganizacional("Dirección Financiera Corporativa"); raci3.setNivelResponsabilidad("C");

        bai04.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai04); flujo1.setPracticaGestion("BAI04.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Áreas Comerciales"); flujo1.setDescripcion("Metas oficiales de ventas de vehículos y pronósticos de lanzamiento de nuevos servicios digitales.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai04); flujo2.setPracticaGestion("BAI04.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO06.01"); flujo2.setDescripcion("Requerimientos formales de presupuesto para la adquisición anticipada de infraestructura y ampliación de licencias corporativas.");

        bai04.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai04); hab1.setNombreHabilidad("Planificación Estratégica de Infraestructura y Modelado Matemático"); hab1.setDocumentacionRelacionada("Directrices Internacionales de Gestión de Servicios Informáticos de Alto Rendimiento"); hab1.setReferenciaEspecifica("De este marco normativo se rescatan las metodologías precisas para establecer líneas base de consumo y la aplicación de algoritmos predictivos que proyectan la demanda tecnológica futura con un alto grado de exactitud.");

        bai04.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai04); pol1.setTituloPolitica("Directiva Corporativa de Alta Disponibilidad y Tolerancia a Fallos"); pol1.setDescripcionPolitica("Regulación interna que prohíbe mantener los servicios críticos operando por encima del setenta y cinco por ciento de su capacidad máxima bajo condiciones normales. Esta política obliga a contar siempre con un margen de reserva del veinticinco por ciento para absorber imprevistos sin afectar la experiencia del consumidor."); pol1.setDocumentacionRelacionada("Manual de Continuidad y Operaciones Críticas"); pol1.setReferenciaEspecifica("Sección: Reglas de Amortiguación de Carga Tecnológica");

        bai04.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE ANTICIPACIÓN
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai04); cult1.setElementoCultural("Cultura de Anticipación y Visión a Largo Plazo"); cult1.setDocumentacionRelacionada("Principios Directivos de Estabilidad Operacional"); cult1.setReferenciaEspecifica("Inculcar en la gerencia técnica la convicción de que reaccionar ante la saturación de un servidor es un fracaso administrativo, promoviendo en su lugar una mentalidad proactiva donde las inversiones se aprueban y ejecutan mucho antes de que la necesidad se vuelva urgente.");

        bai04.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai04); serv1.setNombreServicioHerramienta("Plataformas de Monitoreo Analítico Predictivo para Servidores y Redes de Telecomunicaciones");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai04); serv2.setNombreServicioHerramienta("Herramientas de Simulación de Carga Transaccional y Emuladores de Tráfico Masivo");

        bai04.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai04);
    }
}