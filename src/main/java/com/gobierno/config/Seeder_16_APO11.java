package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(11)
public class Seeder_16_APO11 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_16_APO11(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO11")) {
            cargarAPO11();
        }
    }

    private void cargarAPO11() {
        ProcesoCobit apo11 = new ProcesoCobit();
        apo11.setIdProceso("APO11");
        apo11.setDominio("Alinear, Planificar y Organizar");
        apo11.setAreaPrioritaria("Modelo Core de COBIT");
        apo11.setNombreProceso("Gestionar la calidad");
        apo11.setDescripcionProceso("Definir y comunicar los requisitos de calidad en todos los procesos, procedimientos y resultados relacionados de la empresa, incluyendo los controles, la monitorización en curso y el uso de prácticas probadas de mejora continua.");
        apo11.setPropositoProceso("Asegurar la entrega consistente de soluciones tecnológicas y de servicios (OTA, Arene OS) que satisfagan los requerimientos de calidad de la empresa y satisfagan las necesidades de los usuarios (Customer-First).");

        apo11.setMetasAlineamiento("AG05: Entrega de servicios de TI acorde a los requisitos del negocio.\nAG06: Agilidad para convertir los requisitos del negocio en soluciones operativas.");
        apo11.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG05: Cultura de innovación orientada al cliente.");
        apo11.setMetricasModelo("Métrica 1: Porcentaje de proyectos de TI y operaciones que han sido certificados según estándares de calidad.\nMétrica 2: Nivel de satisfacción de los usuarios con la calidad del servicio.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo11);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO11.01");
        pract01.setNombrePractica("Establecer un sistema de gestión de calidad");
        pract01.setDescripcionPractica("Establecer y mantener un sistema de gestión de la calidad (QMS) que proporcione un enfoque estándar, formal y continuo con respecto a la gestión de la calidad.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir una política de calidad que esté alineada con los objetivos de negocio y la estrategia de calidad de la empresa."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Definir, implantar y mantener procesos, procedimientos y estándares de gestión de la calidad aplicables de manera general."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Definir los roles y responsabilidades de gestión de la calidad y asignar los recursos adecuados para apoyar el sistema de gestión de calidad."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO11.03");
        pract02.setNombrePractica("Enfocar la gestión de la calidad en los clientes");
        pract02.setDescripcionPractica("Enfocar la gestión de la calidad en los clientes (Customer-First), determinando y analizando regularmente los requerimientos de calidad desde su punto de vista.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Identificar de forma continua los requerimientos y expectativas de calidad de los clientes respecto de los servicios y productos habilitados por I&T."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Integrar la voz del cliente en el desarrollo y la entrega de soluciones tecnológicas (ej. retroalimentación post OTA)."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Supervisar el cumplimiento del nivel de servicio y actuar proactivamente para corregir desviaciones."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO11.05");
        pract03.setNombrePractica("Mantener la mejora continua");
        pract03.setDescripcionPractica("Mantener y mejorar regularmente el sistema de gestión de la calidad (SGC).");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Revisar regularmente el rendimiento del QMS contra los estándares de calidad internos y externos y buscar oportunidades de mejora."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Llevar a cabo auditorías de calidad para confirmar el cumplimiento continuo de las directrices y los procedimientos aplicables."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo11.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo11); raci1.setPracticaGestion("APO11.01"); raci1.setRolOrganizacional("Director de Información (CIO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo11); raci2.setPracticaGestion("APO11.03"); raci2.setRolOrganizacional("Gerente de Calidad de TI"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo11); raci3.setPracticaGestion("APO11.05"); raci3.setRolOrganizacional("Líder de Mejora Continua"); raci3.setNivelResponsabilidad("R");
        apo11.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo11); flujo1.setPracticaGestion("APO11.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO02.05"); flujo1.setDescripcion("Estrategia y hoja de ruta tecnológica.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo11); flujo2.setPracticaGestion("APO11.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA01.03"); flujo2.setDescripcion("Resultados de las auditorías del SGC y planes de mejora continua.");
        apo11.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo11); hab1.setNombreHabilidad("Gestión de Calidad (Quality Management)"); hab1.setDocumentacionRelacionada("Marco e-CF (European e-Competence Framework)"); hab1.setReferenciaEspecifica("E.4 - Relaciones y Calidad.");
        apo11.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(apo11); pol1.setTituloPolitica("Política de Calidad del Software Vehicular Automotriz"); pol1.setDescripcionPolitica("Mandato corporativo que prohíbe el paso a producción de cualquier componente del Arene OS que no haya superado satisfactoriamente los protocolos ISO/IEC 25010 y pruebas de estrés."); pol1.setDocumentacionRelacionada("Sistema de Gestión de Calidad (SGC) Toyota"); pol1.setReferenciaEspecifica("Capítulo: Control de Calidad en Código Fuente");
        apo11.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(apo11); cult1.setElementoCultural("Cultura Jidoka (Automatización con toque humano)"); cult1.setDocumentacionRelacionada("Principios Toyota Way"); cult1.setReferenciaEspecifica("Detener el proceso inmediatamente cuando ocurre una anomalía en el código para prevenir que componentes defectuosos lleguen a los vehículos.");
        apo11.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(apo11); serv1.setNombreServicioHerramienta("Sistemas de Gestión de Calidad Automatizados (SonarQube para análisis de código)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo11); serv2.setNombreServicioHerramienta("Plataformas de Testing de Software Automotriz");
        apo11.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo11);
    }
}