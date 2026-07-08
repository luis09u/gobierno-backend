package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(11) // Continuidad secuencial estricta
public class Seeder_11_APO06 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_11_APO06(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO06")) {
            System.out.println("Iniciando carga de datos de control financiero: APO06...");
            cargarAPO06();
            System.out.println("APO06 (Gestión del Presupuesto y Costos) cargado exitosamente.");
        }
    }

    private void cargarAPO06() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DIRECTIVO Y ADMINISTRATIVO)
        // ==========================================
        ProcesoCobit apo06 = new ProcesoCobit();
        apo06.setIdProceso("APO06");
        apo06.setDominio("Alinear, Planificar y Organizar");
        apo06.setAreaPrioritaria("Modelo Core de COBIT");
        apo06.setNombreProceso("Gestionar el presupuesto y los costos");
        apo06.setDescripcionProceso("Administrar las actividades financieras relacionadas con la tecnología de la información de la empresa, abarcando la planificación, asignación y control de presupuestos, así como el análisis de costos para garantizar un uso eficiente de los recursos económicos corporativos.");
        apo06.setPropositoProceso("Garantizar la transparencia y previsibilidad del gasto tecnológico, permitiendo que la infraestructura en la nube y el soporte para las actualizaciones inalámbricas operen bajo un modelo de costos eficiente, alineado con los límites financieros de la organización.");

        apo06.setMetasAlineamiento("AG04: Optimización del valor y los costos de los servicios y soluciones tecnológicas.\nAG10: Transparencia y exactitud en la asignación presupuestaria y costos de tecnología.");
        apo06.setMetasEmpresariales("EG04: Alta calidad en los informes financieros para la toma de decisiones estratégicas.\nEG08: Optimización y maximización de la eficiencia en los costos de los procesos internos del negocio.");
        apo06.setMetricasModelo("Métrica 1: Desviación porcentual entre el presupuesto tecnológico mensual planificado y el gasto real ejecutado.\nMétrica 2: Costo operativo unitario por vehículo conectado para la distribución segura de parches de software.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE CONTROL DE GASTO
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo06);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO06.01");
        pract01.setNombrePractica("Administrar el presupuesto financiero de tecnología");
        pract01.setDescripcionPractica("Establecer y consolidar los recursos financieros asignados a la operación técnica, dividiendo con claridad los costos fijos de infraestructura y los variables de consumo bajo demanda.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Elaborar un presupuesto maestro anual que contemple los costos de almacenamiento en servidores en la nube y el mantenimiento de las licencias de software vehicular."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Revisar de manera mensual la ejecución de los fondos presupuestados con las áreas de contabilidad para detectar desviaciones tempranas."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO06.02");
        pract02.setNombrePractica("Modelar y asignar los costos tecnológicos");
        pract02.setDescripcionPractica("Diseñar un esquema transparente que permita identificar con exactitud qué áreas, proyectos o funciones vehiculares consumen mayor cantidad de recursos financieros.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir fórmulas de distribución de costos que asignen el gasto de procesamiento en la nube a las unidades de negocio correspondientes (ej. área de infoentretenimiento vs. área de seguridad motriz)."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Monitorear el costo variable del tráfico de datos celulares asociado a las descargas inalámbricas realizadas por los clientes."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO06.03");
        pract03.setNombrePractica("Gestionar las desviaciones de costos");
        pract03.setDescripcionPractica("Implementar mecanismos de supervisión proactiva para detener o corregir de inmediato cualquier exceso en el gasto operativo de los servidores corporativos.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Establecer notificaciones de control presupuestario que se activen de forma automática cuando el consumo de la red de distribución en la nube supere el ochenta por ciento del presupuesto estimado mensual."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Diseñar e implementar planes de acción inmediata para optimizar el almacenamiento de datos históricos que ya no requieran procesamiento de alta velocidad."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo06.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo06); raci1.setPracticaGestion("APO06.01"); raci1.setRolOrganizacional("Director de Finanzas (CFO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo06); raci2.setPracticaGestion("APO06.02"); raci2.setRolOrganizacional("Director de Información y Tecnología (CIO)"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo06); raci3.setPracticaGestion("APO06.03"); raci3.setRolOrganizacional("Líderes de Operaciones e Infraestructura"); raci3.setNivelResponsabilidad("R");

        apo06.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo06); flujo1.setPracticaGestion("APO06.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO05.02"); flujo1.setDescripcion("Asignaciones de presupuesto y techos financieros aprobados para las iniciativas del portafolio.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo06); flujo2.setPracticaGestion("APO06.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO02.05"); flujo2.setDescripcion("Informes consolidados de costos reales y proyecciones presupuestarias para la actualización de la estrategia.");

        apo06.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo06); hab1.setNombreHabilidad("Contabilidad Analítica de Tecnología"); hab1.setDocumentacionRelacionada("Modelos de Gestión de Costos Corporativos"); hab1.setReferenciaEspecifica("Estructuración de centros de costos, análisis de variaciones y control del gasto en infraestructura bajo demanda.");

        apo06.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo06); pol1.setTituloPolitica("Política de Control de Gastos en Infraestructura Tecnológica Bajo Demanda"); pol1.setDescripcionPolitica("Directriz que obliga a los equipos de desarrollo a configurar apagados automáticos de entornos de prueba fuera del horario laboral y prohíbe el aprovisionamiento de capacidad de servidores en la nube sin una orden de compra debidamente codificada."); pol1.setDocumentacionRelacionada("Manual de Control Interno y Finanzas"); pol1.setReferenciaEspecifica("Sección: Eficiencia y Racionalización del Gasto Digital");

        apo06.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE CONTROL
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo06); cult1.setElementoCultural("Cultura de Conciencia de Costos en Ingeniería"); cult1.setDocumentacionRelacionada("Principios de Gestión Operativa Eficiente"); cult1.setReferenciaEspecifica("Fomentar de forma permanente que los ingenieros diseñen software limpio y optimizado, entendiendo que un código ineficiente consume más procesamiento en la nube y eleva directamente los costos de la empresa.");

        apo06.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo06); serv1.setNombreServicioHerramienta("Sistemas de Gestión de Costos y Asignación de Recursos de Servidores");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo06); serv2.setNombreServicioHerramienta("Plataformas ERP Corporativas para la Conciliación Presupuestaria");

        apo06.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo06);
    }
}