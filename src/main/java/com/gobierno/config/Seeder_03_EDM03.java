package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(3) // Tercer proceso del marco COBIT 2019
public class Seeder_03_EDM03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_03_EDM03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("EDM03")) {
            System.out.println("Iniciando carga de datos oficiales: EDM03...");
            cargarEDM03();
            System.out.println("EDM03 (Asegurar la optimización del riesgo) cargado exitosamente.");
        }
    }

    private void cargarEDM03() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit edm03 = new ProcesoCobit();
        edm03.setIdProceso("EDM03");
        edm03.setDominio("Evaluar, Dirigir y Monitorizar");
        edm03.setAreaPrioritaria("Modelo Core de COBIT");
        edm03.setNombreProceso("Asegurar la optimización del riesgo");
        edm03.setDescripcionProceso("Asegurar que el apetito y la tolerancia al riesgo de la empresa se entiendan, articulen y comuniquen, y que se identifique y gestione el riesgo para el valor de negocio relacionado con el uso de I&T.");
        edm03.setPropositoProceso("Asegurarse de que el riesgo de negocio relacionado con la I&T no exceda el apetito y tolerancia al riesgo de la empresa, que se identifique y gestione el impacto del riesgo de I&T para el valor de negocio y que se minimicen los posibles fallos de cumplimiento.");

        edm03.setMetasAlineamiento("AG02: Gestión de riesgo relacionado con I&T.\nAG07: Seguridad de la información, infraestructura de procesamiento y aplicaciones, y privacidad.");
        edm03.setMetasEmpresariales("EG02: Gestión de riesgo de negocio.\nEG06: Continuidad y disponibilidad del servicio del negocio.");
        edm03.setMetricasModelo("Métrica 1: Porcentaje de objetivos y servicios empresariales críticos cubiertos por la evaluación de riesgos (EG02).\nMétrica 2: Número de incidentes significativos que no se identificaron en la evaluación de riesgos frente al total de incidentes (EG02/AG02).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (OFICIALES)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM03.01");
        pract01.setNombrePractica("Evaluar la gestión de riesgos");
        pract01.setDescripcionPractica("Examinar y evaluar continuamente el efecto del riesgo sobre el uso actual y futuro de las I&T en la empresa. Considerar si el apetito al riesgo de la empresa es apropiado, y que se identifique y gestione el riesgo.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Conocer la organización y su contexto en relación al riesgo de I&T; determinar el apetito y los niveles de tolerancia al riesgo."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Evaluar los factores de riesgo de I&T de forma proactiva antes de tomar decisiones estratégicas a nivel de empresa."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Evaluar las actividades de gestión de riesgos para asegurar que se alineen con la capacidad de la empresa para las pérdidas relacionadas con I&T."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM03.02");
        pract02.setNombrePractica("Dirigir la gestión de riesgos");
        pract02.setDescripcionPractica("Dirigir el establecimiento de prácticas de gestión de riesgos para ofrecer una seguridad razonable de que las prácticas de gestión de riesgos de I&T son apropiadas y que el riesgo de I&T actual no sobrepasa al apetito al riesgo.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Dirigir la traducción e integración de la estrategia de riesgo de I&T en las prácticas de gestión de riesgos y las actividades operativas."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Dirigir la implementación de los mecanismos adecuados para responder de forma rápida al cambio de riesgos e informar inmediatamente a los cargos de dirección."); a2_2.setNivelCapacidadEsperado(2); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Identificar las metas y métricas claves de los procesos de gobierno y gestión de riesgos que deben monitorizarse, y aprobar las estrategias."); a2_3.setNivelCapacidadEsperado(3); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("EDM03.03");
        pract03.setNombrePractica("Monitorizar la gestión de riesgos");
        pract03.setDescripcionPractica("Monitorizar las metas y las métricas clave de los procesos de gestión de riesgos. Establecer cómo las desviaciones o los problemas se identificarán, se les dará seguimiento y se comunicarán para su solución.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Comunicar cualquier problema de gestión de riesgos al consejo de administración o comité ejecutivo."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Supervisar hasta qué punto se gestiona el perfil de riesgo dentro de los umbrales de tolerancia y apetito de riesgo de la empresa."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Monitorizar las metas y métricas de los procesos de gobierno y gestión de riesgos contra los objetivos, analizar la causa de las posibles desviaciones y remediar."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        edm03.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(edm03); raci1.setPracticaGestion("EDM03.01"); raci1.setRolOrganizacional("Consejo de Administración"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(edm03); raci2.setPracticaGestion("EDM03.02"); raci2.setRolOrganizacional("Comité Ejecutivo / Comité de riesgos empresariales"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(edm03); raci3.setPracticaGestion("EDM03.03"); raci3.setRolOrganizacional("Director de riesgos"); raci3.setNivelResponsabilidad("R");
        edm03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(edm03); flujo1.setPracticaGestion("EDM03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.01"); flujo1.setDescripcion("Problemas y factores de riesgo emergentes.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(edm03); flujo2.setPracticaGestion("EDM03.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO12.01"); flujo2.setDescripcion("Objetivos clave a monitorizar para la gestión de riesgos y políticas de gestión de riesgos.");
        edm03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(edm03); hab1.setNombreHabilidad("Gestión de riesgo del negocio"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: BURM. Capacidades para la correcta evaluación y administración del riesgo corporativo.");
        edm03.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(edm03); pol1.setTituloPolitica("Política de riesgos empresariales"); pol1.setDescripcionPolitica("Define el gobierno y gestión del riesgo empresarial a nivel estratégico, táctico y operativo, en búsqueda de satisfacer los objetivos de negocio. Traduce el gobierno de la empresa en política y principios de gobierno del riesgo y elabora actividades de gestión de riesgos."); pol1.setDocumentacionRelacionada("NIST Special Publication 800-53"); pol1.setReferenciaEspecifica("3.17 Risk assessment (RA-1)");
        edm03.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(edm03); cult1.setElementoCultural("Cultura consciente de los riesgos de I&T"); cult1.setDocumentacionRelacionada("COSO Enterprise Risk Management"); cult1.setReferenciaEspecifica("Promover una cultura consciente de los riesgos de I&T en todos los niveles de la organización y facultar proactivamente a la empresa para que identifique, comunique y escale el riesgo, oportunidad y posibles impactos. Fomentar que los empleados informen sobre problemas y muestren transparencia.");
        edm03.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(edm03); serv1.setNombreServicioHerramienta("Sistema de gestión de riesgos");
        edm03.setComponenteG_Servicios(Arrays.asList(serv1));

        procesoRepository.save(edm03);
    }
}