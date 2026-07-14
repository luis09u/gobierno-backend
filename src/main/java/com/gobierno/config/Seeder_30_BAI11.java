package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(30) // Cierre del dominio BAI
public class Seeder_30_BAI11 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_30_BAI11(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI11")) {
            System.out.println("Iniciando carga de datos de gestión operativa de proyectos: BAI11...");
            cargarBAI11();
            System.out.println("BAI11 (Gestión de los Proyectos) cargado exitosamente.");
        }
    }

    private void cargarBAI11() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE EJECUCIÓN IMPLACABLE)
        // ==========================================
        ProcesoCobit bai11 = new ProcesoCobit();
        bai11.setIdProceso("BAI11");
        bai11.setDominio("Construir, Adquirir e Implementar");
        bai11.setAreaPrioritaria("Modelo Core de COBIT");
        bai11.setNombreProceso("Gestionar los proyectos");
        bai11.setDescripcionProceso("Dirigir de forma meticulosa todas las iniciativas tecnológicas desde su inicio hasta su cierre formal, coordinando los recursos humanos y financieros para asegurar la entrega de resultados concretos dentro del tiempo planificado y bajo los parámetros de calidad exigidos por la alta dirección.");
        bai11.setPropositoProceso("Asegurar que la construcción de nuevas plataformas telemáticas y herramientas operativas para la red de concesionarios no sufra retrasos cronológicos ni sobrecostos financieros, garantizando que cada fase de trabajo se complete con exactitud para proteger la rentabilidad institucional.");

        bai11.setMetasAlineamiento("AG09: Entrega de iniciativas tecnológicas a tiempo junto con el cumplimiento irrestricto de los requisitos financieros y funcionales.\nAG05: Prestación de servicios informáticos en total concordancia con los requerimientos documentados del negocio.");
        bai11.setMetasEmpresariales("EG08: Optimización absoluta y maximización de la eficiencia en los costos de los procesos institucionales.\nEG01: Diseño de un portafolio de productos comerciales altamente competitivos.");
        bai11.setMetricasModelo("Métrica 1: Porcentaje de proyectos tecnológicos que finalizaron exactamente dentro del presupuesto original aprobado por el comité de inversiones.\nMétrica 2: Índice de desviación cronológica promedio calculado a partir de las fechas de entrega pactadas en el acta de inicio corporativa.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE DIRECCIÓN TÉCNICA
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai11);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI11.02");
        pract01.setNombrePractica("Iniciar y planificar el proyecto de manera estructurada");
        pract01.setDescripcionPractica("Definir el alcance exacto del trabajo y asegurar la disponibilidad de los recursos antes de autorizar a los ingenieros a comenzar sus labores de programación.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Redactar un acta de constitución formal que detalle los entregables esperados y establezca los límites funcionales de la nueva plataforma automotriz para evitar el crecimiento descontrolado de las peticiones comerciales."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Desglosar el trabajo en paquetes de tareas manejables y asignar responsables directos con plazos de cumplimiento inamovibles."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI11.06");
        pract02.setNombrePractica("Controlar la ejecución y gestionar los riesgos");
        pract02.setDescripcionPractica("Medir el progreso físico de la construcción tecnológica frente a la línea base aprobada para corregir de inmediato cualquier síntoma de retraso.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Aplicar la técnica del valor ganado para cuantificar objetivamente si el dinero invertido hasta la fecha se corresponde con el porcentaje real de código informático finalizado."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Convocar reuniones de control semanales donde los directores técnicos deban justificar cualquier desviación en el cronograma y proponer planes de aceleración inmediatos."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI11.07");
        pract03.setNombrePractica("Cerrar formalmente el proyecto");
        pract03.setDescripcionPractica("Concluir las actividades de desarrollo mediante un proceso administrativo riguroso que libere los recursos humanos y financieros sobrantes.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Requerir la firma de liquidación técnica y económica por parte del comité auditor antes de desintegrar al equipo de trabajo asignado a la creación del sistema vehicular."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Transferir formalmente el producto terminado hacia las gerencias de mantenimiento continuo acompañando dicha entrega con los manuales operativos definitivos."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai11.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai11); raci1.setPracticaGestion("BAI11.02"); raci1.setRolOrganizacional("Director Individual del Proyecto"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai11); raci2.setPracticaGestion("BAI11.06"); raci2.setRolOrganizacional("Oficina Central de Gestión de Proyectos"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai11); raci3.setPracticaGestion("BAI11.07"); raci3.setRolOrganizacional("Gerentes Directivos de las Unidades de Negocio"); raci3.setNivelResponsabilidad("C");

        bai11.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai11); flujo1.setPracticaGestion("BAI11.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI01.05"); flujo1.setDescripcion("Asignación de presupuestos y prioridades estratégicas dictaminadas a nivel de programas corporativos.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai11); flujo2.setPracticaGestion("BAI11.07"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS01.01"); flujo2.setDescripcion("Sistemas informáticos operativos entregados oficialmente junto con la respectiva liberación de los presupuestos remanentes.");

        bai11.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai11); hab1.setNombreHabilidad("Dirección Avanzada de Proyectos Tecnológicos"); hab1.setDocumentacionRelacionada("Cuerpo de Conocimiento de la Dirección de Proyectos avalado por el Instituto Internacional de Gestión de Proyectos"); hab1.setReferenciaEspecifica("De este estándar global se rescata rigurosamente la metodología para integrar el control del cronograma con los límites del presupuesto, asegurando mediante un sistema de evaluación de valor ganado que ninguna modificación en los requisitos altere los costos operativos sin una validación gerencial previa.");

        bai11.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai11); pol1.setTituloPolitica("Directiva Corporativa de Cierre y Liquidación de Proyectos Informáticos"); pol1.setDescripcionPolitica("Normativa de cumplimiento obligatorio que prohíbe el inicio de nuevas iniciativas tecnológicas por parte de un equipo de ingeniería si este mantiene proyectos previos en estado inconcluso o sin acta de cierre formal. Esta medida erradica la acumulación de desarrollos fantasma que drenan silenciosamente los recursos financieros de la empresa."); pol1.setDocumentacionRelacionada("Manual de Gobierno de Portafolios e Inversiones"); pol1.setReferenciaEspecifica("Sección: Rendición de Cuentas y Liberación de Presupuesto");

        bai11.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai11); cult1.setElementoCultural("Cultura de Ejecución Impecable y Transparencia Absoluta"); cult1.setDocumentacionRelacionada("Código de Responsabilidad y Desempeño Profesional"); cult1.setReferenciaEspecifica("Promover a nivel gerencial un entorno laboral donde informar sobre un retraso inminente sea considerado un acto de lealtad hacia la organización, eliminando el ocultamiento de malas noticias que impide a la directiva tomar acciones correctivas a tiempo.");

        bai11.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai11); serv1.setNombreServicioHerramienta("Plataformas Digitales de Control de Cronogramas y Diagramación de Rutas Críticas");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai11); serv2.setNombreServicioHerramienta("Sistemas Institucionales de Control Presupuestario y Medición del Valor Ganado");

        bai11.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai11);
    }
}