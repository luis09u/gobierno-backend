package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(3) // Se ejecuta después del EDM02
public class Seeder_03_EDM03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_03_EDM03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("EDM03")) {
            System.out.println("Iniciando carga de datos 3FN: EDM03...");
            cargarEDM03();
            System.out.println("EDM03 (Optimización del Riesgo) cargado exitosamente.");
        }
    }

    private void cargarEDM03() {
        // ==========================================
        // INFORMACIÓN GENERAL (Contexto Toyota / OTA mantenido)
        // ==========================================
        ProcesoCobit edm03 = new ProcesoCobit();
        edm03.setIdProceso("EDM03");
        edm03.setDominio("Evaluar, Dirigir y Monitorizar");
        edm03.setAreaPrioritaria("Modelo Core de COBIT");
        edm03.setNombreProceso("Asegurar la optimización del riesgo");
        edm03.setDescripcionProceso("Asegurar que el apetito y la tolerancia al riesgo de la empresa sean entendidos, articulados y comunicados, y que el riesgo para el valor de la empresa relacionado con el uso de la TI sea identificado y gestionado.");
        edm03.setPropositoProceso("Garantizar que las vulnerabilidades cibernéticas del entorno Cloud (AWS) y del canal de transmisión OTA no comprometan la seguridad física de los conductores ni el cumplimiento de la UNECE WP.29.");

        edm03.setMetasAlineamiento("AG01: Cumplimiento de TI y soporte a la conformidad externa (Auditorías CSMS).\nAG05: Entrega de servicios de TI acorde a los requisitos de seguridad del negocio.");
        edm03.setMetasEmpresariales("EG06: Continuidad y disponibilidad del servicio de negocio ante ataques cibernéticos.\nEG01: Portafolio de productos seguros y competitivos.");
        edm03.setMetricasModelo("Métrica 1: Porcentaje de actualizaciones OTA que pasaron con éxito las pruebas de penetración antes del despliegue.\nMétrica 2: Frecuencia de revisión del apetito de riesgo cibernético por parte del Directorio.");

        // ==========================================
        // COMPONENTE A: PROCESOS (TEXTOS OFICIALES COBIT 2019)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 01 Oficial
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM03.01");
        pract01.setNombrePractica("Evaluar la gestión del riesgo");
        pract01.setDescripcionPractica("Examinar y juzgar continuamente el efecto del riesgo sobre el valor actual y futuro y el uso de la I&T en la empresa. Considerar si el apetito de riesgo de la empresa es apropiado.");

        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Determinar el nivel del apetito por el riesgo de la I&T de la empresa y asegurar la alineación con el apetito de riesgo general de la empresa."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Evaluar y aprobar el apetito y la tolerancia al riesgo que son aceptables para la empresa."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Identificar los actores internos y externos clave y sus requerimientos con respecto a la gestión del riesgo."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        Actividad a1_4 = new Actividad(); a1_4.setPractica(pract01); a1_4.setDescripcionActividad("Evaluar el diseño del marco de gobierno para el riesgo y evaluar cómo gestionar e informar sobre dicho riesgo."); a1_4.setNivelCapacidadEsperado(4); a1_4.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3, a1_4));

        // Práctica 02 Oficial
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM03.02");
        pract02.setNombrePractica("Dirigir la gestión del riesgo");
        pract02.setDescripcionPractica("Dirigir el establecimiento de prácticas de gestión de riesgos para proporcionar una seguridad razonable de que las prácticas de gestión del riesgo de I&T son apropiadas y no exceden el apetito de riesgo.");

        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Dirigir la implementación de procesos de gestión de riesgos adecuados y alineados con el enfoque de riesgo de la empresa."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Dirigir la integración de la gestión del riesgo empresarial y la gestión del riesgo de la I&T."); a2_2.setNivelCapacidadEsperado(2); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Fomentar una cultura de riesgo proactiva y transparente en toda la empresa desde la alta dirección."); a2_3.setNivelCapacidadEsperado(3); a2_3.setCalificacionActual("N");
        Actividad a2_4 = new Actividad(); a2_4.setPractica(pract02); a2_4.setDescripcionActividad("Asegurar que los planes de acción para mitigar los riesgos críticos se estén ejecutando de forma efectiva."); a2_4.setNivelCapacidadEsperado(4); a2_4.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3, a2_4));

        // Práctica 03 Oficial
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("EDM03.03");
        pract03.setNombrePractica("Monitorizar la gestión del riesgo");
        pract03.setDescripcionPractica("Monitorizar los objetivos clave y las métricas de los procesos de gestión de riesgos. Establecer cómo se identificarán, se hará seguimiento y se notificarán las desviaciones o los problemas.");

        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Reportar cualquier problema de gestión de riesgo a la junta directiva y al comité ejecutivo de manera oportuna."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Monitorizar el grado en el que el perfil de riesgo de la empresa se mantiene dentro de los límites de apetito y tolerancia establecidos."); a3_2.setNivelCapacidadEsperado(2); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Asegurar la presentación de informes oportunos, exactos y completos sobre el estado del riesgo a los actores interesados."); a3_3.setNivelCapacidadEsperado(3); a3_3.setCalificacionActual("N");
        Actividad a3_4 = new Actividad(); a3_4.setPractica(pract03); a3_4.setDescripcionActividad("Evaluar periódicamente el desempeño y eficacia de las prácticas de gestión del riesgo y realizar mejoras de manera continua."); a3_4.setNivelCapacidadEsperado(4); a3_4.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3, a3_4));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        edm03.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(edm03); raci1.setPracticaGestion("EDM03.01"); raci1.setRolOrganizacional("Junta Directiva"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(edm03); raci2.setPracticaGestion("EDM03.01"); raci2.setRolOrganizacional("Director de Seguridad de la Información (CISO)"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(edm03); raci3.setPracticaGestion("EDM03.02"); raci3.setRolOrganizacional("Comité de Riesgos"); raci3.setNivelResponsabilidad("A");
        MatrizRaci raci4 = new MatrizRaci(); raci4.setProceso(edm03); raci4.setPracticaGestion("EDM03.03"); raci4.setRolOrganizacional("Auditoría Interna"); raci4.setNivelResponsabilidad("I");

        edm03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3, raci4));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(edm03); flujo1.setPracticaGestion("EDM03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.01"); flujo1.setDescripcion("Resultados de análisis de riesgos cibernéticos y escenarios de amenaza OTA.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(edm03); flujo2.setPracticaGestion("EDM03.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO12.02"); flujo2.setDescripcion("Declaración aprobada del apetito de riesgo para el despliegue en AWS.");
        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(edm03); flujo3.setPracticaGestion("EDM03.03"); flujo3.setTipoFlujo("ENTRADA"); flujo3.setOrigenDestino("DE: MEA03.02"); flujo3.setDescripcion("Informes de cumplimiento normativo (WP.29 CSMS).");

        edm03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3));

        // ==========================================
        // COMPONENTE D: HABILIDADES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(edm03); hab1.setNombreHabilidad("Gestión de Riesgos de Ciberseguridad"); hab1.setDocumentacionRelacionada("Certificación CRISC (ISACA)"); hab1.setReferenciaEspecifica("Identificación y mitigación de riesgos tecnológicos");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(edm03); hab2.setNombreHabilidad("Seguridad en Arquitecturas Cloud"); hab2.setDocumentacionRelacionada("AWS Certified Security - Specialty"); hab2.setReferenciaEspecifica("Diseño de redes seguras (VPC) y cifrado KMS");

        edm03.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(edm03); pol1.setTituloPolitica("Política de Ciberseguridad Vehicular (Zero Trust)"); pol1.setDescripcionPolitica("Ningún dispositivo, interno o externo, debe ser confiado por defecto. Todo paquete OTA debe ser verificado criptográficamente antes de su instalación en el Arene OS."); pol1.setDocumentacionRelacionada("Manual de Seguridad de la Información Toyota"); pol1.setReferenciaEspecifica("Anexo Técnico: Controles Criptográficos para OTA");

        edm03.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(edm03); cult1.setElementoCultural("Seguridad desde el Diseño (Security by Design)"); cult1.setDocumentacionRelacionada("Código de Conducta de Ingeniería"); cult1.setReferenciaEspecifica("Fomento de la proactividad: Todo desarrollador es responsable de reportar vulnerabilidades sin temor a represalias.");

        edm03.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS E INFRAESTRUCTURA
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(edm03); serv1.setNombreServicioHerramienta("AWS Security Hub & Amazon GuardDuty");
        Servicio serv2 = new Servicio(); serv2.setProceso(edm03); serv2.setNombreServicioHerramienta("Sistema de Información de Seguridad y Gestión de Eventos (SIEM - Splunk)");

        edm03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        // PERSISTENCIA
        procesoRepository.save(edm03);
    }
}