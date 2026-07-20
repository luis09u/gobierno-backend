package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(18) // Secuencia en el dominio APO
public class Seeder_18_APO13 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_18_APO13(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO13")) {
            System.out.println("Iniciando carga de datos oficiales: APO13...");
            cargarAPO13();
            System.out.println("APO13 (Gestionar la seguridad) cargado exitosamente.");
        }
    }

    private void cargarAPO13() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit apo13 = new ProcesoCobit();
        apo13.setIdProceso("APO13");
        apo13.setDominio("Alinear, Planificar y Organizar");
        apo13.setAreaPrioritaria("Modelo Core de COBIT");
        apo13.setNombreProceso("Gestionar la seguridad");
        apo13.setDescripcionProceso("Definir, operar y monitorizar un sistema de gestión de seguridad de la información.");
        apo13.setPropositoProceso("Mantener el impacto y la ocurrencia de incidentes de seguridad de la información dentro de los niveles de apetito de riesgo de la empresa, evitando la inyección de software malicioso y protegiendo las redes 5G vehiculares.");

        apo13.setMetasAlineamiento("AG07: Seguridad de la información, infraestructura y aplicaciones de procesamiento y privacidad.");
        apo13.setMetasEmpresariales("EG02: Gestión de riesgo de negocio.\nEG06: Continuidad y disponibilidad del servicio del negocio.");
        apo13.setMetricasModelo("Métrica 1: Número de incidentes de confidencialidad que causan pérdidas financieras o descrédito público (AG07).\nMétrica 2: Número de interrupciones del servicio al cliente o procesos de negocio que han causado incidentes significativos (EG06).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo13);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO13.01");
        pract01.setNombrePractica("Establecer y mantener un sistema de gestión de seguridad de la información (SGSI)");
        pract01.setDescripcionPractica("Establecer y mantener un sistema de gestión de seguridad de la información (SGSI) que proporcione un enfoque estándar, formal y continuo para la gestión de la ciberseguridad.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir el alcance y los límites del SGSI abarcando servidores en la nube, canales OTA y las ECUs de los vehículos conectados."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Alinear el SGSI con el enfoque global de la empresa hacia la gestión de la seguridad, incluyendo las normativas WP.29 sobre ciberseguridad automotriz."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Obtener la autorización de la dirección para implementar la arquitectura Zero Trust y preparar la declaración de aplicabilidad del SGSI."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO13.02");
        pract02.setNombrePractica("Definir y gestionar un plan de tratamiento de riesgos de seguridad");
        pract02.setDescripcionPractica("Mantener un plan que describa cómo se debe manejar el riesgo de seguridad, basando las mejoras en la protección contra infiltraciones a nivel de red y de hardware (HSM).");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Formular y mantener un plan de tratamiento de riesgos alineado con la arquitectura empresarial y las vulnerabilidades detectadas en los protocolos de comunicación CAN bus."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Integrar la planificación y diseño de controles capaces de permitir la prevención y detección rápida de eventos de seguridad (ej. IPS/IDS perimetrales)."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Definir cómo medir la eficacia de las prácticas seleccionadas, utilizando simulaciones de penetración en laboratorios de prueba de vehículos."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO13.03");
        pract03.setNombrePractica("Monitorizar y revisar el sistema de gestión de seguridad (SGSI)");
        pract03.setDescripcionPractica("Recopilar y analizar datos sobre el SGSI, mejorando su efectividad continuamente para anticipar y neutralizar vectores de ataque emergentes.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Llevar a cabo revisiones regulares de la eficacia del SGSI. Incluir el cumplimiento de la política de seguridad y revisar las prácticas de privacidad de datos telemáticos."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Realizar periódicamente una revisión de la gestión del SGSI y ejecutar auditorías para asegurar que los controles criptográficos en los servidores sigan siendo robustos."); a3_2.setNivelCapacidadEsperado(5); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Hacer aportes para el mantenimiento de los planes de seguridad para incorporar los hallazgos de las actividades de monitorización del tráfico OTA en tiempo real."); a3_3.setNivelCapacidadEsperado(5); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo13.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo13); raci1.setPracticaGestion("APO13.01"); raci1.setRolOrganizacional("Director de seguridad de la información"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo13); raci2.setPracticaGestion("APO13.02"); raci2.setRolOrganizacional("Director de seguridad de la información"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo13); raci3.setPracticaGestion("APO13.03"); raci3.setRolOrganizacional("Director de seguridad de la información / Director de privacidad"); raci3.setNivelResponsabilidad("A");
        apo13.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo13); flujo1.setPracticaGestion("APO13.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Estrategia de seguridad corporativa"); flujo1.setDescripcion("Estrategia de seguridad de la empresa alineada al riesgo cibernético.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo13); flujo2.setPracticaGestion("APO13.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los procesos APO, BAI, DSS, MEA, EDM"); flujo2.setDescripcion("Plan de tratamiento del riesgo de seguridad de la información.");
        apo13.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo13); hab1.setNombreHabilidad("Desarrollo de la estrategia de seguridad de la información"); hab1.setDocumentacionRelacionada("e-Competence Framework (e-CF) Part 1, 2016"); hab1.setReferenciaEspecifica("D. Enable—D.1. Information Security Strategy Development.");
        apo13.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo13); pol1.setTituloPolitica("Política de seguridad de la información y privacidad"); pol1.setDescripcionPolitica("Establecer las directrices de comportamiento para proteger la información, sistemas e infraestructura corporativa. Para alcanzar la eficiencia operativa, sincronizar la política de seguridad con el riesgo y la política de privacidad de I&T."); pol1.setDocumentacionRelacionada("ISO/IEC 27001:2013"); pol1.setReferenciaEspecifica("5.2 Policy / 5. Information security policies.");
        apo13.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo13); cult1.setElementoCultural("Cultura de concienciación de seguridad y privacidad"); cult1.setDocumentacionRelacionada("Creating a Culture of Security, ISACA, 2011"); cult1.setReferenciaEspecifica("Establecer una cultura que influya positivamente en la implementación de la política de seguridad en la práctica diaria. Proporcionar directrices e identificar campeones en seguridad y privacidad en toda la organización.");
        apo13.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo13); serv1.setNombreServicioHerramienta("Servicios de concienciación de seguridad y privacidad");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo13); serv2.setNombreServicioHerramienta("Servicios de evaluación de seguridad de terceros");
        apo13.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo13);
    }
}