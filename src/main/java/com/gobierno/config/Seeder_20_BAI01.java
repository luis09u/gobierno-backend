package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(20) // Inicio del dominio BAI
public class Seeder_20_BAI01 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_20_BAI01(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI01")) {
            System.out.println("Iniciando carga de datos de gestión de proyectos: BAI01...");
            cargarBAI01();
            System.out.println("BAI01 (Gestión de Programas y Proyectos) cargado exitosamente.");
        }
    }

    private void cargarBAI01() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE EJECUCIÓN EJECUTIVA)
        // ==========================================
        ProcesoCobit bai01 = new ProcesoCobit();
        bai01.setIdProceso("BAI01");
        bai01.setDominio("Construir, Adquirir e Implementar");
        bai01.setAreaPrioritaria("Modelo Core de COBIT");
        bai01.setNombreProceso("Gestionar los programas y proyectos");
        bai01.setDescripcionProceso("Dirigir de manera coordinada y estructurada todas las iniciativas tecnológicas aprobadas por la alta dirección, garantizando que se cumplan los plazos establecidos, se respete el presupuesto financiero y se alcancen los beneficios operativos planificados.");
        bai01.setPropositoProceso("Garantizar la ejecución controlada de la plataforma vehicular y las actualizaciones a distancia, asegurando una transición ordenada desde la planificación financiera hasta la entrega exitosa de las nuevas funcionalidades al cliente final.");

        bai01.setMetasAlineamiento("AG09: Entrega de programas y proyectos a tiempo, dentro del presupuesto y cumpliendo estrictamente con los requisitos del negocio.\nAG08: Habilitación y soporte a las operaciones de la empresa mediante tecnología.");
        bai01.setMetasEmpresariales("EG01: Portafolio de productos comerciales competitivos y de alto valor.\nEG08: Optimización y maximización de la eficiencia en los costos de los procesos institucionales.");
        bai01.setMetricasModelo("Métrica 1: Porcentaje de proyectos tecnológicos vehiculares entregados sin desviaciones en el cronograma original ni en el presupuesto asignado.\nMétrica 2: Nivel de satisfacción de la junta directiva con la calidad y los beneficios obtenidos al finalizar cada proyecto.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE DIRECCIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI01.01");
        pract01.setNombrePractica("Mantener un enfoque estándar para la dirección de proyectos");
        pract01.setDescripcionPractica("Definir una metodología institucional obligatoria para planificar, ejecutar y evaluar todas las iniciativas tecnológicas, evitando la improvisación operativa.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Establecer un manual corporativo de dirección de proyectos que defina las fases de control y los documentos de aprobación requeridos antes de iniciar cualquier construcción de sistemas."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Integrar puntos de revisión obligatorios donde el comité directivo autorice el paso de la fase de diseño a la fase de construcción masiva."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI01.05");
        pract02.setNombrePractica("Planificar las iniciativas tecnológicas");
        pract02.setDescripcionPractica("Estructurar los cronogramas, asignar al personal calificado y reservar los recursos financieros necesarios antes de dar inicio a la ejecución técnica.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Elaborar planes de trabajo detallados que identifiquen la ruta crítica de entrega para las nuevas funciones de seguridad del vehículo."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Asegurar la disponibilidad del talento humano interno e infraestructura externa requerida para cumplir con las fechas de lanzamiento comercial."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI01.06");
        pract03.setNombrePractica("Supervisar y controlar la ejecución");
        pract03.setDescripcionPractica("Medir constantemente el avance del trabajo frente a la línea base planificada, corrigiendo de inmediato cualquier desviación económica o de plazos.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Emitir reportes gerenciales quincenales sobre el consumo del presupuesto y el progreso físico de las plataformas vehiculares en construcción."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Ejecutar planes de recuperación inmediatos si un hito de entrega crítico sufre un retraso que comprometa el lanzamiento de la temporada automotriz."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai01.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai01); raci1.setPracticaGestion("BAI01.01"); raci1.setRolOrganizacional("Oficina de Gestión de Proyectos (PMO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai01); raci2.setPracticaGestion("BAI01.05"); raci2.setRolOrganizacional("Directores de Proyecto"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai01); raci3.setPracticaGestion("BAI01.06"); raci3.setRolOrganizacional("Comité Ejecutivo de Inversiones"); raci3.setNivelResponsabilidad("I");

        bai01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai01); flujo1.setPracticaGestion("BAI01.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO05.02"); flujo1.setDescripcion("Aprobación oficial de presupuesto y selección de iniciativas de inversión.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai01); flujo2.setPracticaGestion("BAI01.06"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: EDM02.02"); flujo2.setDescripcion("Informes de estado, control de riesgos y desviaciones financieras de los proyectos en curso.");

        bai01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai01); hab1.setNombreHabilidad("Dirección Corporativa de Proyectos"); hab1.setDocumentacionRelacionada("Estándares de Dirección de Proyectos (PMBOK / PRINCE2)"); hab1.setReferenciaEspecifica("Capacidad para gestionar restricciones concurrentes de alcance, cronograma, presupuesto, calidad y recursos.");

        bai01.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai01); pol1.setTituloPolitica("Directiva de Gestión y Control Institucional de Proyectos"); pol1.setDescripcionPolitica("Normativa que prohíbe el inicio de cualquier fase de desarrollo de sistemas sin contar con un acta de constitución de proyecto firmada, un cronograma aprobado y fondos asignados oficialmente por la dirección financiera."); pol1.setDocumentacionRelacionada("Manual de Gobernanza y Portafolio de Inversiones"); pol1.setReferenciaEspecifica("Sección: Reglas de Inicio y Ejecución de Iniciativas Tecnológicas");

        bai01.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE CUMPLIMIENTO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai01); cult1.setElementoCultural("Cultura de Responsabilidad sobre los Compromisos Adquiridos"); cult1.setDocumentacionRelacionada("Valores Directivos de la Organización"); cult1.setReferenciaEspecifica("Inculcar en los equipos técnicos un sentido de urgencia y precisión administrativa, entendiendo que los retrasos en las entregas tecnológicas impactan directamente en las promesas comerciales hechas al consumidor.");

        bai01.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai01); serv1.setNombreServicioHerramienta("Sistemas de Información para la Gestión y Control de Portafolios (PPM)");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai01); serv2.setNombreServicioHerramienta("Plataformas Institucionales de Planificación de Recursos y Diagramación de Cronogramas");

        bai01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai01);
    }
}