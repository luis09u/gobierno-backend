package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(5) // Se ejecuta después del EDM04
public class Seeder_05_EDM05 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_05_EDM05(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("EDM05")) {
            System.out.println("Iniciando carga de datos 3FN: EDM05...");
            cargarEDM05();
            System.out.println("EDM05 (Transparencia hacia Partes Interesadas) cargado exitosamente.");
        }
    }

    private void cargarEDM05() {
        // ==========================================
        // INFORMACIÓN GENERAL
        // ==========================================
        ProcesoCobit edm05 = new ProcesoCobit();
        edm05.setIdProceso("EDM05");
        edm05.setDominio("Evaluar, Dirigir y Monitorizar");
        edm05.setAreaPrioritaria("Modelo Core de COBIT");
        edm05.setNombreProceso("Asegurar la transparencia hacia las partes interesadas");
        edm05.setDescripcionProceso("Asegurar que la medición y elaboración de informes del desempeño y cumplimiento de la TI de la empresa sean transparentes, con las partes interesadas aprobando las metas, las métricas y las acciones correctivas.");
        edm05.setPropositoProceso("Mantener la confianza de los clientes, entes reguladores (UNECE) y red de concesionarios, demostrando que los despliegues OTA son seguros, respetan la privacidad de los datos telemáticos y cumplen rigurosamente con la legislación vigente.");

        edm05.setMetasAlineamiento("AG01: Cumplimiento de TI y soporte a la conformidad externa.\nAG10: Calidad de la información financiera y de gestión de TI.");
        edm05.setMetasEmpresariales("EG03: Cumplimiento de leyes y regulaciones externas e internas.\nEG04: Calidad de la información de gestión y financiera.");
        edm05.setMetricasModelo("Métrica 1: Nivel de satisfacción de las partes interesadas (reguladores y clientes) con los informes de transparencia y uso de datos.\nMétrica 2: Número de incidentes legales o multas relacionadas con la privacidad de los datos recopilados por los vehículos.");

        // ==========================================
        // COMPONENTE A: PROCESOS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm05);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM05.01");
        pract01.setNombrePractica("Evaluar los requerimientos de informes");
        pract01.setDescripcionPractica("Examinar las exigencias legales y las expectativas de los clientes respecto a la información que genera el ecosistema de vehículos conectados.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Mapear los requisitos de la normativa de protección de datos (ej. GDPR, Leyes locales) sobre la telemetría almacenada en AWS."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Evaluar qué métricas de rendimiento del Arene OS deben ser visibles para la red de concesionarios mecánicos."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM05.02");
        pract02.setNombrePractica("Dirigir la comunicación y elaboración de informes");
        pract02.setDescripcionPractica("Asegurar que se establezcan canales efectivos para divulgar el cumplimiento y el rendimiento de las TI.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Aprobar los términos y condiciones de uso de software (EULA) que aparecerán en la pantalla del vehículo antes de una actualización OTA."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Establecer un portal público y seguro donde los conductores puedan ver qué datos específicos transmite su vehículo a la nube."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("EDM05.03");
        pract03.setNombrePractica("Monitorizar la comunicación");
        pract03.setDescripcionPractica("Supervisar que la información entregada a las partes interesadas sea precisa, oportuna y comprensible.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Auditar anualmente los reportes de cumplimiento enviados a las autoridades reguladoras automotrices."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Revisar las quejas de los clientes en relación con la claridad de los mensajes de actualización de software en sus consolas."); a3_2.setNivelCapacidadEsperado(2); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        edm05.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(edm05); raci1.setPracticaGestion("EDM05.01"); raci1.setRolOrganizacional("Director Jurídico (Compliance Officer)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(edm05); raci2.setPracticaGestion("EDM05.02"); raci2.setRolOrganizacional("Director de Comunicaciones Corporativas"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(edm05); raci3.setPracticaGestion("EDM05.03"); raci3.setRolOrganizacional("Auditoría Interna / Externa"); raci3.setNivelResponsabilidad("R");

        edm05.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(edm05); flujo1.setPracticaGestion("EDM05.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Entorno externo"); flujo1.setDescripcion("Actualizaciones de leyes de protección de datos aplicables a telemetría vehicular.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(edm05); flujo2.setPracticaGestion("EDM05.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Entidades Externas y Clientes"); flujo2.setDescripcion("Políticas de privacidad y reportes de cumplimiento de seguridad del Arene OS.");
        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(edm05); flujo3.setPracticaGestion("EDM05.03"); flujo3.setTipoFlujo("ENTRADA"); flujo3.setOrigenDestino("DE: MEA01.03"); flujo3.setDescripcion("Métricas de desempeño y disponibilidad de las actualizaciones OTA.");

        edm05.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3));

        // ==========================================
        // COMPONENTE D: HABILIDADES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(edm05); hab1.setNombreHabilidad("Cumplimiento Normativo (Compliance)"); hab1.setDocumentacionRelacionada("Perfil Corporativo Legal"); hab1.setReferenciaEspecifica("Experiencia en regulaciones de privacidad de datos (GDPR / Leyes locales de protección).");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(edm05); hab2.setNombreHabilidad("Gestión de Relaciones con Partes Interesadas"); hab2.setDocumentacionRelacionada("Marco SFIA v8"); hab2.setReferenciaEspecifica("Gestión de Relaciones (RLMT) - Nivel 6.");

        edm05.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(edm05); pol1.setTituloPolitica("Política de Transparencia de Datos Telemáticos"); pol1.setDescripcionPolitica("Establece la obligatoriedad de informar al conductor, en lenguaje claro y sin tecnicismos, qué información de su vehículo se envía a AWS y con qué finalidad (ej. mantenimiento predictivo)."); pol1.setDocumentacionRelacionada("Manual de Gobierno Corporativo"); pol1.setReferenciaEspecifica("Sección: Privacidad y Derechos del Consumidor");

        edm05.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(edm05); cult1.setElementoCultural("Rendición de cuentas proactiva (Accountability)"); cult1.setDocumentacionRelacionada("Código Ético Toyota Way"); cult1.setReferenciaEspecifica("Fomento de una cultura donde los errores de software se comunican abiertamente a los entes reguladores para promover la seguridad general de la industria.");

        edm05.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS E INFRAESTRUCTURA
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(edm05); serv1.setNombreServicioHerramienta("Portal web de Transparencia y Gestión de Privacidad para el Cliente");
        Servicio serv2 = new Servicio(); serv2.setProceso(edm05); serv2.setNombreServicioHerramienta("Software de elaboración de informes normativos (GRC Platforms)");

        edm05.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        // PERSISTENCIA
        procesoRepository.save(edm05);
    }
}