package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(9)
public class Seeder_09_APO04 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_09_APO04(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO04")) {
            System.out.println("Iniciando carga de datos 3FN: APO04...");
            cargarAPO04();
            System.out.println("APO04 (Gestión de la Innovación) cargado exitosamente.");
        }
    }

    private void cargarAPO04() {
        ProcesoCobit apo04 = new ProcesoCobit();
        apo04.setIdProceso("APO04");
        apo04.setDominio("Alinear, Planificar y Organizar");
        apo04.setAreaPrioritaria("Modelo Core de COBIT");
        apo04.setNombreProceso("Gestionar la innovación");
        apo04.setDescripcionProceso("Mantener un conocimiento de las tendencias de TI y servicios relacionados, identificar oportunidades de innovación y planificar cómo beneficiarse de ellas en relación con las necesidades del negocio.");
        apo04.setPropositoProceso("Lograr una ventaja competitiva explorando tecnologías emergentes (ej. IA Generativa, Edge Computing, 6G) para integrarlas en futuras actualizaciones del Arene OS y crear nuevas fuentes de ingresos por suscripción.");

        apo04.setMetasAlineamiento("AG04: Satisfacción del negocio con las inversiones en I&T y los servicios prestados.\nAG06: Agilidad para convertir los requisitos de negocio en soluciones operativas.");
        apo04.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG05: Cultura de innovación orientada al cliente.");
        apo04.setMetricasModelo("Métrica 1: Número de Pruebas de Concepto (PoC) tecnológicas exitosas transferidas al portafolio de desarrollo de Arene OS.\nMétrica 2: Porcentaje del presupuesto total de TI asignado a iniciativas de Investigación y Desarrollo (I+D).");

        // ==========================================
        // COMPONENTE A: PROCESOS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo04);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO04.01");
        pract01.setNombrePractica("Crear un entorno favorable a la innovación");
        pract01.setDescripcionPractica("Crear un ambiente donde la ideación y el pensamiento disruptivo sobre el futuro de la movilidad sean fomentados y recompensados.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Organizar Hackathons internos trimestrales para proponer nuevas funcionalidades de software OTA."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Establecer un presupuesto 'Sandbox' en AWS para que los desarrolladores puedan probar servicios emergentes (ej. AWS IoT FleetWise) sin burocracia."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO04.03");
        pract02.setNombrePractica("Monitorear y explorar el entorno tecnológico");
        pract02.setDescripcionPractica("Realizar vigilancia tecnológica sobre qué están haciendo las startups y los gigantes de la tecnología en el sector automotriz.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Investigar la viabilidad del Edge Computing para procesar modelos de Machine Learning directamente en la computadora del vehículo, reduciendo el envío de datos a la nube."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Analizar protocolos de seguridad post-cuántica para preparar los canales de transmisión OTA contra amenazas futuras."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO04.05");
        pract03.setNombrePractica("Recomendar iniciativas de innovación");
        pract03.setDescripcionPractica("Transformar las exploraciones exitosas en casos de negocio formales para su desarrollo.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Documentar el Retorno de Inversión (ROI) estimado de las Pruebas de Concepto (PoC) validadas."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Transferir la documentación de la arquitectura de la innovación aprobada al equipo de desarrollo (Scrum) para su integración en el próximo Sprint de Arene OS."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo04.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo04); raci1.setPracticaGestion("APO04.01"); raci1.setRolOrganizacional("Director de Innovación (Chief Innovation Officer)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo04); raci2.setPracticaGestion("APO04.03"); raci2.setRolOrganizacional("Arquitectos de Nube y Tecnologías Emergentes"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo04); raci3.setPracticaGestion("APO04.05"); raci3.setRolOrganizacional("Comité Ejecutivo / Junta Directiva"); raci3.setNivelResponsabilidad("I");

        apo04.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo04); flujo1.setPracticaGestion("APO04.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Entorno Externo"); flujo1.setDescripcion("Informes de tendencias tecnológicas (Gartner, Forrester) sobre la industria automotriz y SDV.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo04); flujo2.setPracticaGestion("APO04.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO05.02"); flujo2.setDescripcion("Propuestas de Casos de Negocio para nuevas iniciativas de I+D (Pruebas de concepto validadas).");

        apo04.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo04); hab1.setNombreHabilidad("Investigación y Desarrollo (I+D)"); hab1.setDocumentacionRelacionada("Marco SFIA v8"); hab1.setReferenciaEspecifica("Innovación (INOV) - Nivel 6: Promoción y gestión de la innovación tecnológica.");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(apo04); hab2.setNombreHabilidad("Vigilancia Tecnológica"); hab2.setDocumentacionRelacionada("Estándares ISO 56000 (Gestión de la Innovación)"); hab2.setReferenciaEspecifica("Evaluación continua de tecnologías emergentes (IA, Blockchain, Edge).");

        apo04.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo04); pol1.setTituloPolitica("Política de Laboratorios de Innovación y Pruebas"); pol1.setDescripcionPolitica("Establece las directrices y los límites de seguridad para el uso de entornos 'Sandbox'. Todo código experimental debe mantenerse estrictamente aislado del entorno de producción OTA para evitar inyecciones accidentales en los vehículos de los clientes."); pol1.setDocumentacionRelacionada("Directrices de Arquitectura Arene OS"); pol1.setReferenciaEspecifica("Sección: Aislamiento de Entornos de I+D");

        apo04.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo04); cult1.setElementoCultural("Mentalidad 'Fail Fast, Learn Fast' (Tolerancia al error)"); cult1.setDocumentacionRelacionada("Manifiesto Ágil Corporativo"); cult1.setReferenciaEspecifica("Fomentar un entorno donde el fracaso temprano en pruebas de concepto (PoC) sea visto como aprendizaje validado, reduciendo el miedo a proponer ideas disruptivas.");

        apo04.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS E INFRAESTRUCTURA
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo04); serv1.setNombreServicioHerramienta("Entornos Sandbox de AWS (AWS IoT Core, SageMaker para pruebas de IA)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo04); serv2.setNombreServicioHerramienta("Simuladores Virtuales de Vehículos (Digital Twins) para Pruebas de Código");

        apo04.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo04);
    }
}