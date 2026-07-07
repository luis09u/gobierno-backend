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
        // INFORMACIÓN GENERAL
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
        // COMPONENTE A: PROCESOS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM03.01");
        pract01.setNombrePractica("Evaluar la gestión del riesgo");
        pract01.setDescripcionPractica("Examinar y juzgar continuamente el efecto del riesgo sobre el valor actual y futuro del proyecto OTA.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Evaluar escenarios de riesgo cibernético (ej. intercepción de paquetes OTA vía Man-in-the-Middle)."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Determinar el nivel de tolerancia al riesgo para la latencia en comunicaciones 5G con los vehículos."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM03.02");
        pract02.setNombrePractica("Dirigir la gestión del riesgo");
        pract02.setDescripcionPractica("Dirigir el establecimiento de prácticas de gestión de riesgos para proporcionar una seguridad razonable frente a amenazas vehiculares.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Exigir la implementación de Arquitectura Zero Trust y cifrado E2EE para todas las conexiones vehículo-nube."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Promulgar la política de detener inmediatamente cualquier despliegue OTA si se detecta una brecha crítica de seguridad (Kill Switch)."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("EDM03.03");
        pract03.setNombrePractica("Monitorizar la gestión del riesgo");
        pract03.setDescripcionPractica("Supervisar los objetivos clave de la gestión de riesgos para asegurar el alineamiento con la normativa WP.29.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Monitorear los reportes del Centro de Operaciones de Seguridad (SOC) integrados con AWS Security Hub."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Revisar las métricas de mitigación de vulnerabilidades descubiertas en el firmware del Arene OS."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

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