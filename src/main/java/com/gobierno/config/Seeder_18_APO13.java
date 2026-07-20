package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(18)
public class Seeder_18_APO13 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_18_APO13(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO13")) {
            cargarAPO13();
        }
    }

    private void cargarAPO13() {
        ProcesoCobit apo13 = new ProcesoCobit();
        apo13.setIdProceso("APO13");
        apo13.setDominio("Alinear, Planificar y Organizar");
        apo13.setAreaPrioritaria("Modelo Core de COBIT");
        apo13.setNombreProceso("Gestionar la seguridad");
        apo13.setDescripcionProceso("Definir, operar y monitorizar un sistema de gestión de seguridad de la información. Mantener el impacto y la probabilidad de incidentes de seguridad de la información dentro del nivel de apetito de riesgo de la empresa.");
        apo13.setPropositoProceso("Establecer una barrera de defensa impenetrable que garantice que las redes de comunicación, los servidores centrales y el sistema operativo de los vehículos (Arene OS) estén blindados contra intromisiones no autorizadas, espionaje corporativo o sabotaje operativo.");

        apo13.setMetasAlineamiento("AG02: Gestión de riesgos relacionados con I&T.\nAG07: Seguridad de la información, infraestructura de procesamiento y de las aplicaciones.");
        apo13.setMetasEmpresariales("EG02: Riesgo de negocio gestionado.\nEG06: Continuidad y disponibilidad del servicio de negocio.");
        apo13.setMetricasModelo("Métrica 1: Número de incidentes de seguridad relacionados con I&T.\nMétrica 2: Nivel de madurez del sistema de gestión de seguridad de la información.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo13);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO13.01");
        pract01.setNombrePractica("Establecer y mantener un sistema de gestión de seguridad de la información (SGSI)");
        pract01.setDescripcionPractica("Establecer y mantener un sistema de gestión de seguridad de la información (SGSI) que proporcione un enfoque estándar, formal y continuo respecto a la gestión de seguridad de la información.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir el alcance y los límites del sistema de gestión de seguridad de la información en función del entorno, contexto y partes interesadas."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Alinear el sistema de gestión de seguridad de la información con el enfoque general que tiene la empresa sobre la gestión de seguridad y de riesgo."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Definir los roles y responsabilidades de gestión de la seguridad."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        Actividad a1_4 = new Actividad(); a1_4.setPractica(pract01); a1_4.setDescripcionActividad("Obtener la autorización de la dirección para implementar y operar el sistema de gestión de seguridad de la información."); a1_4.setNivelCapacidadEsperado(4); a1_4.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3, a1_4));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO13.02");
        pract02.setNombrePractica("Definir y gestionar un plan de tratamiento de riesgo de la seguridad de la información");
        pract02.setDescripcionPractica("Mantener un plan de seguridad de la información que describa el modo en que se gestionarán los riesgos. Este plan de tratamiento de riesgos deberá alinearse con la estrategia y la arquitectura de la I&T corporativas.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Formular y mantener un plan de tratamiento de riesgos que establezca los controles y responsabilidades para gestionar los riesgos de seguridad."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Integrar el plan de tratamiento de riesgos de la seguridad de la información con la estrategia y el proceso de gestión de riesgos."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Implementar controles preventivos, detectivos y correctivos y evaluar su eficacia."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO13.03");
        pract03.setNombrePractica("Monitorizar y revisar el sistema de gestión de seguridad de la información (SGSI)");
        pract03.setDescripcionPractica("Realizar revisiones continuas del sistema de gestión de seguridad de la información para confirmar que los objetivos fijados se han conseguido e implementar mejoras sistemáticamente.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Supervisar y evaluar sistemáticamente el desempeño y eficacia de los controles de seguridad."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Realizar revisiones de gestión independientes y auditorías internas para identificar debilidades en el SGSI."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo13.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo13); raci1.setPracticaGestion("APO13.01"); raci1.setRolOrganizacional("Director de Seguridad de la Información (CISO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo13); raci2.setPracticaGestion("APO13.02"); raci2.setRolOrganizacional("Gerencia de Arquitectura y Redes"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo13); raci3.setPracticaGestion("APO13.03"); raci3.setRolOrganizacional("Auditoría Interna e Inspectoría Corporativa"); raci3.setNivelResponsabilidad("C");
        apo13.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo13); flujo1.setPracticaGestion("APO13.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.02"); flujo1.setDescripcion("Análisis de riesgos operativos y perfil de amenazas aprobado por la alta dirección.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo13); flujo2.setPracticaGestion("APO13.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA02.01"); flujo2.setDescripcion("Informes gerenciales sobre el estado de la protección perimetral e incidentes neutralizados.");
        apo13.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo13); hab1.setNombreHabilidad("Estrategia y Arquitectura de Seguridad Digital"); hab1.setDocumentacionRelacionada("Estándares Internacionales de Ciberseguridad Vehicular (UNECE WP.29)"); hab1.setReferenciaEspecifica("Estructuración de defensas criptográficas avanzadas y diseño de controles contra la manipulación de sistemas integrados.");
        apo13.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(apo13); pol1.setTituloPolitica("Estatuto Corporativo de Seguridad de la Información y Defensa Perimetral"); pol1.setDescripcionPolitica("Normativa restrictiva que prohíbe taxativamente la transferencia de paquetes de datos a la flota vehicular sin validación de firmas digitales auténticas. Asimismo, obliga a la revocación inmediata de todos los accesos del personal que sea desvinculado de la organización."); pol1.setDocumentacionRelacionada("Manual de Protección de Activos Institucionales"); pol1.setReferenciaEspecifica("Sección: Control Absoluto de Accesos e Identidades");
        apo13.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(apo13); cult1.setElementoCultural("Cultura de Desconfianza Estructural y Cero Tolerancia"); cult1.setDocumentacionRelacionada("Directrices de Comportamiento Ético y Operativo"); cult1.setReferenciaEspecifica("Inculcar en cada colaborador la premisa de que todo correo, archivo o solicitud de acceso inusual debe ser considerado como una amenaza potencial hasta que se demuestre lo contrario, fomentando la validación constante de credenciales.");
        apo13.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(apo13); serv1.setNombreServicioHerramienta("Centros de Comando y Monitoreo de Eventos de Seguridad Ininterrumpidos");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo13); serv2.setNombreServicioHerramienta("Plataformas Automáticas de Gestión de Identidades, Cifrado y Control de Accesos");
        apo13.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo13);
    }
}