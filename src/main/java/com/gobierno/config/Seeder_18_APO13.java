package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(18) // Ejecución secuencial en el sistema
public class Seeder_18_APO13 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_18_APO13(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO13")) {
            System.out.println("Iniciando carga de datos de seguridad corporativa: APO13...");
            cargarAPO13();
            System.out.println("APO13 (Gestión de la Seguridad) cargado exitosamente.");
        }
    }

    private void cargarAPO13() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE PROTECCIÓN Y GOBIERNO)
        // ==========================================
        ProcesoCobit apo13 = new ProcesoCobit();
        apo13.setIdProceso("APO13");
        apo13.setDominio("Alinear, Planificar y Organizar");
        apo13.setAreaPrioritaria("Modelo Core de COBIT");
        apo13.setNombreProceso("Gestionar la seguridad");
        apo13.setDescripcionProceso("Definir, operar y supervisar un sistema de gestión integral de la seguridad para mantener la confidencialidad, integridad y disponibilidad de la información, protegiendo los activos digitales y físicos de la organización frente a amenazas internas y externas.");
        apo13.setPropositoProceso("Establecer una barrera de defensa impenetrable que garantice que las redes de comunicación, los servidores centrales y el sistema operativo de los vehículos estén blindados contra intromisiones no autorizadas, espionaje corporativo o sabotaje operativo.");

        apo13.setMetasAlineamiento("AG02: Gestión integral de los riesgos de seguridad asociados a la tecnología.\nAG07: Seguridad, confiabilidad e integridad permanente de la infraestructura de procesamiento de datos.");
        apo13.setMetasEmpresariales("EG03: Cumplimiento estricto de leyes, normativas de protección de datos y regulaciones sectoriales.\nEG06: Continuidad operativa y alta disponibilidad de los servicios comerciales.");
        apo13.setMetricasModelo("Métrica 1: Número total de incidentes de seguridad críticos que lograron vulnerar las defensas perimetrales durante el año fiscal.\nMétrica 2: Tiempo promedio de respuesta y aislamiento de la red desde que se detecta un intento de infiltración externa.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE SEGURIDAD
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo13);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO13.01");
        pract01.setNombrePractica("Establecer y mantener un sistema de gestión de seguridad");
        pract01.setDescripcionPractica("Estructurar un marco normativo y operativo continuo que rija todas las prácticas de protección de datos y control de accesos en la empresa.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir protocolos de cifrado de alta complejidad matemática para proteger los paquetes de datos que viajan desde la central hacia la computadora de los vehículos."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Implementar arquitecturas de confianza nula, exigiendo verificación de identidad obligatoria para cada conexión interna y externa, sin excepciones."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO13.02");
        pract02.setNombrePractica("Definir y gestionar un plan de tratamiento de riesgos de seguridad");
        pract02.setDescripcionPractica("Planificar y ejecutar las contramedidas específicas necesarias para neutralizar las vulnerabilidades descubiertas en los sistemas.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Ejecutar simulacros de infiltración controlada de forma periódica para evaluar la resistencia de las redes corporativas ante ataques organizados."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Desarrollar procedimientos de aislamiento automático que desconecten de la red a cualquier vehículo que emita señales anómalas de manipulación."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO13.03");
        pract03.setNombrePractica("Monitorear y revisar el sistema de gestión de seguridad");
        pract03.setDescripcionPractica("Supervisar ininterrumpidamente el tráfico de la red para detectar actividades sospechosas o desviaciones de los estándares de protección.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Establecer un centro de comando centralizado que analice el comportamiento de las conexiones en tiempo real durante las veinticuatro horas del día."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Auditar mensualmente los registros de acceso a los servidores críticos para confirmar que no existan credenciales institucionales comprometidas."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo13.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo13); raci1.setPracticaGestion("APO13.01"); raci1.setRolOrganizacional("Director de Seguridad de la Información (CISO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo13); raci2.setPracticaGestion("APO13.02"); raci2.setRolOrganizacional("Gerencia de Arquitectura y Redes"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo13); raci3.setPracticaGestion("APO13.03"); raci3.setRolOrganizacional("Auditoría Interna e Inspectoría Corporativa"); raci3.setNivelResponsabilidad("C");

        apo13.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo13); flujo1.setPracticaGestion("APO13.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.02"); flujo1.setDescripcion("Análisis de riesgos operativos y perfil de amenazas aprobado por la alta dirección.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo13); flujo2.setPracticaGestion("APO13.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA02.01"); flujo2.setDescripcion("Informes gerenciales sobre el estado de la protección perimetral e incidentes neutralizados.");

        apo13.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo13); hab1.setNombreHabilidad("Estrategia y Arquitectura de Seguridad Digital"); hab1.setDocumentacionRelacionada("Estándares Internacionales de Ciberseguridad Vehicular (UNECE WP.29)"); hab1.setReferenciaEspecifica("Estructuración de defensas criptográficas avanzadas y diseño de controles contra la manipulación de sistemas integrados.");

        apo13.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo13); pol1.setTituloPolitica("Estatuto Corporativo de Seguridad de la Información y Defensa Perimetral"); pol1.setDescripcionPolitica("Normativa restrictiva que prohíbe taxativamente la transferencia de paquetes de datos a la flota vehicular sin validación de firmas digitales auténticas. Asimismo, obliga a la revocación inmediata de todos los accesos del personal que sea desvinculado de la organización."); pol1.setDocumentacionRelacionada("Manual de Protección de Activos Institucionales"); pol1.setReferenciaEspecifica("Sección: Control Absoluto de Accesos e Identidades");

        apo13.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE SEGURIDAD
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo13); cult1.setElementoCultural("Cultura de Desconfianza Estructural y Cero Tolerancia"); cult1.setDocumentacionRelacionada("Directrices de Comportamiento Ético y Operativo"); cult1.setReferenciaEspecifica("Inculcar en cada colaborador la premisa de que todo correo, archivo o solicitud de acceso inusual debe ser considerado como una amenaza potencial hasta que se demuestre lo contrario, fomentando la validación constante de credenciales.");

        apo13.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo13); serv1.setNombreServicioHerramienta("Centros de Comando y Monitoreo de Eventos de Seguridad Ininterrumpidos");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo13); serv2.setNombreServicioHerramienta("Plataformas Automáticas de Gestión de Identidades, Cifrado y Control de Accesos");

        apo13.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo13);
    }
}