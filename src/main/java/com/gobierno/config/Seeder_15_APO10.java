package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(15) // Continuidad secuencial de la arquitectura de datos
public class Seeder_15_APO10 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_15_APO10(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO10")) {
            System.out.println("Iniciando carga de datos de gestión de proveedores: APO10...");
            cargarAPO10();
            System.out.println("APO10 (Gestión de Proveedores) cargado exitosamente.");
        }
    }

    private void cargarAPO10() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE CORPORATIVO Y CONTRACTUAL)
        // ==========================================
        ProcesoCobit apo10 = new ProcesoCobit();
        apo10.setIdProceso("APO10");
        apo10.setDominio("Alinear, Planificar y Organizar");
        apo10.setAreaPrioritaria("Modelo Core de COBIT");
        apo10.setNombreProceso("Gestionar los proveedores");
        apo10.setDescripcionProceso("Administrar los servicios proporcionados por socios y proveedores tecnológicos externos para garantizar que satisfagan las necesidades de la organización, optimizando las relaciones comerciales, asegurando la calidad del servicio y mitigando los riesgos asociados a contratos externos.");
        apo10.setPropositoProceso("Asegurar que las empresas encargadas del suministro de infraestructura en la nube, conectividad de telecomunicaciones móviles y herramientas de seguridad cumplan estrictamente con las normativas internacionales y los estándares de calidad requeridos para salvaguardar la flota vehicular.");

        apo10.setMetasAlineamiento("AG04: Optimización del valor y los costos de los servicios y soluciones tecnológicas.\nAG11: Cumplimiento de las políticas internas por parte de los servicios externos.");
        apo10.setMetasEmpresariales("EG03: Cumplimiento de leyes y regulaciones externas aplicables al negocio.\nEG08: Optimización y maximización de la eficiencia en los costos de los procesos internos.");
        apo10.setMetricasModelo("Métrica 1: Porcentaje de proveedores tecnológicos críticos que cumplen plenamente con las auditorías anuales de seguridad de la información.\nMétrica 2: Número de incidentes operativos o caídas del servicio causados directamente por fallas del proveedor externo.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE EVALUACIÓN EXTERNA
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo10);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO10.01");
        pract01.setNombrePractica("Identificar y evaluar los riesgos de los proveedores");
        pract01.setDescripcionPractica("Analizar de forma permanente la solidez financiera, técnica y legal de los socios externos antes de firmar cualquier vínculo comercial de largo plazo.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Evaluar el historial de cumplimiento y las certificaciones internacionales de seguridad de las empresas que postulan para almacenar los datos de la flota vehicular."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Identificar los riesgos de dependencia tecnológica exclusiva con un solo proveedor, diseñando alternativas de respaldo institucional."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO10.03");
        pract02.setNombrePractica("Gestionar los contratos y las relaciones comerciales");
        pract02.setDescripcionPractica("Establecer las salvaguardas legales, condiciones de confidencialidad y términos de renovación que rijan las obligaciones de ambas partes.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Redactar e incluir cláusulas estrictas de confidencialidad y penalidades financieras en los contratos de servicios de conectividad y redes celulares."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Establecer un calendario formal de revisiones contractuales junto al área legal para actualizar los términos económicos según el crecimiento del negocio."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO10.04");
        pract03.setNombrePractica("Gestionar el desempeño y cumplimiento de los proveedores");
        pract03.setDescripcionPractica("Auditar y medir el rendimiento real entregado por los socios externos frente a los compromisos de calidad firmados.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Ejecutar auditorías técnicas anuales a las instalaciones y sistemas del proveedor de la nube para verificar la integridad de la información almacenada."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Revisar trimestralmente los reportes de tiempo de actividad y velocidad de respuesta ante fallos de los operadores de telecomunicaciones externos."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo10.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo10); raci1.setPracticaGestion("APO10.01"); raci1.setRolOrganizacional("Gerencia de Compras y Abastecimiento"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo10); raci2.setPracticaGestion("APO10.03"); raci2.setRolOrganizacional("Director Jurídico y Legal"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo10); raci3.setPracticaGestion("APO10.04"); raci3.setRolOrganizacional("Gestor de Relaciones con Proveedores Tecnológicos"); raci3.setNivelResponsabilidad("R");

        apo10.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo10); flujo1.setPracticaGestion("APO10.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO09.02"); flujo1.setDescripcion("Requisitos mínimos de calidad y disponibilidad exigidos por la organización.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo10); flujo2.setPracticaGestion("APO10.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA01.03"); flujo2.setDescripcion("Resultados consolidados de las evaluaciones de desempeño y auditorías ejecutadas a los socios externos.");

        apo10.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo10); hab1.setNombreHabilidad("Auditoría y Negociación de Contratos Tecnológicos"); hab1.setDocumentacionRelacionada("Modelos de Gestión de Adquisiciones Corporativas"); hab1.setReferenciaEspecifica("Capacidad para evaluar el cumplimiento normativo de terceros, mitigar riesgos en la cadena de suministro y gestionar penalidades comerciales.");

        apo10.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo10); pol1.setTituloPolitica("Estatuto General para la Contratación de Terceros y Seguridad de la Cadena de Suministro"); pol1.setDescripcionPolitica("Directriz corporativa que prohíbe de manera absoluta la contratación de cualquier proveedor tecnológico que no apruebe previamente la auditoría de protección de datos y que no cuente con un seguro de responsabilidad civil vigente ante brechas de seguridad."); pol1.setDocumentacionRelacionada("Manual de Gestión de Riesgos y Cumplimiento Corporativo"); pol1.setReferenciaEspecifica("Sección: Control y Gobierno de Socios Externos");

        apo10.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE CONTROL Y CONFIDENCIALIDAD
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo10); cult1.setElementoCultural("Cultura de Transparencia y Rigor Contractual"); cult1.setDocumentacionRelacionada("Código de Conducta para Socios Comerciales"); cult1.setReferenciaEspecifica("Promover una mentalidad donde las relaciones con terceros se basen en la total transparencia mutua, exigiendo el cumplimiento milimétrico de los términos acordados como muestra del respeto a la seguridad del consumidor final.");

        apo10.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo10); serv1.setNombreServicioHerramienta("Sistemas Corporativos de Gestión de Contratos y Evaluación de Proveedores");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo10); serv2.setNombreServicioHerramienta("Repositorios Centralizados de Documentación Legal y Certificaciones de Terceros");

        apo10.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo10);
    }
}