package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(28) // Continuación de la estructura del dominio BAI
public class Seeder_28_BAI09 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_28_BAI09(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI09")) {
            System.out.println("Iniciando carga de datos de gestión de activos: BAI09...");
            cargarBAI09();
            System.out.println("BAI09 (Gestión de los Activos) cargado exitosamente.");
        }
    }

    private void cargarBAI09() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE PROTECCIÓN PATRIMONIAL)
        // ==========================================
        ProcesoCobit bai09 = new ProcesoCobit();
        bai09.setIdProceso("BAI09");
        bai09.setDominio("Construir, Adquirir e Implementar");
        bai09.setAreaPrioritaria("Modelo Core de COBIT");
        bai09.setNombreProceso("Gestionar los activos");
        bai09.setDescripcionProceso("Administrar el ciclo de vida completo de los componentes informáticos de la empresa, desde su adquisición formal hasta su desecho seguro, garantizando su correcto registro contable, optimizando su valor financiero a lo largo del tiempo y protegiéndolos contra pérdidas operativas o robos.");
        bai09.setPropositoProceso("Asegurar que la organización mantenga un control físico y contable absoluto sobre los servidores de procesamiento, las licencias de programas y las herramientas de diagnóstico utilizadas en la red de concesionarios, previniendo el despilfarro económico y bloqueando cualquier fuga de información originada por la eliminación insegura de equipos obsoletos.");

        bai09.setMetasAlineamiento("AG04: Optimización del valor económico y los costos de los servicios e infraestructura tecnológica.\nAG07: Seguridad, confiabilidad e integridad permanente de los medios de procesamiento de datos.");
        bai09.setMetasEmpresariales("EG08: Optimización y maximización de la eficiencia en los costos de los procesos institucionales.\nEG03: Cumplimiento estricto de leyes de protección a la privacidad y regulaciones sectoriales externas.");
        bai09.setMetricasModelo("Métrica 1: Porcentaje de equipos informáticos físicos cuyo paradero y estado operativo coinciden exactamente con los registros del inventario central durante la auditoría anual.\nMétrica 2: Número de incidentes reportados por licencias de programas comerciales vencidas o utilizadas excediendo los límites legales de contratación.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE CONTROL PATRIMONIAL
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai09);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI09.01");
        pract01.setNombrePractica("Identificar y registrar los activos tecnológicos");
        pract01.setDescripcionPractica("Crear y mantener un censo detallado y centralizado que documente cada componente informático adquirido por la empresa, indicando su ubicación precisa y el responsable de su custodia.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Implementar herramientas de escaneo automático en las redes corporativas para descubrir y registrar en tiempo real cualquier nuevo equipo conectado a la infraestructura de la empresa."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Etiquetar físicamente los servidores y dispositivos de comunicación mediante códigos de lectura automatizada para agilizar los procesos de inspección contable."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI09.02");
        pract02.setNombrePractica("Gestionar el ciclo de vida operativo de los componentes");
        pract02.setDescripcionPractica("Supervisar el estado de los equipos durante sus años de servicio activo para programar rutinas de mantenimiento preventivo y calcular su desgaste financiero.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Coordinar con la gerencia financiera el cálculo de la depreciación de los servidores centrales, planificando la reserva de presupuesto para su renovación antes de que superen su vida útil recomendada."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Monitorear continuamente el uso de las licencias de programas comerciales para reasignar aquellas que no estén siendo aprovechadas, reduciendo así los gastos operativos innecesarios."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI09.05");
        pract03.setNombrePractica("Gestionar la baja y eliminación segura del equipamiento");
        pract03.setDescripcionPractica("Aplicar protocolos estrictos para retirar de circulación los aparatos obsoletos, asegurando que ningún dato corporativo pueda ser recuperado por terceros luego de su desecho.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Ejecutar procedimientos de borrado criptográfico de grado militar sobre los discos duros de los servidores antes de enviarlos a centros de reciclaje electrónico."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Exigir la emisión de certificados legales de destrucción física a las empresas contratistas encargadas de triturar los componentes de almacenamiento altamente confidenciales."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai09.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai09); raci1.setPracticaGestion("BAI09.01"); raci1.setRolOrganizacional("Gestor Principal de Activos Tecnológicos"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai09); raci2.setPracticaGestion("BAI09.02"); raci2.setRolOrganizacional("Dirección Financiera y Contabilidad Institucional"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai09); raci3.setPracticaGestion("BAI09.05"); raci3.setRolOrganizacional("Oficial Jefe de Seguridad de la Información"); raci3.setNivelResponsabilidad("C");

        bai09.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai09); flujo1.setPracticaGestion("BAI09.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO06.02"); flujo1.setDescripcion("Registros de compras aprobadas e información oficial sobre la asignación de presupuestos tecnológicos.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai09); flujo2.setPracticaGestion("BAI09.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS01.04"); flujo2.setDescripcion("Inventario actualizado en tiempo real y certificados legales de destrucción segura de componentes obsoletos.");

        bai09.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai09); hab1.setNombreHabilidad("Gestión Financiera e Inventario de Patrimonio Tecnológico"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información en su vertiente de Control Patrimonial"); hab1.setReferenciaEspecifica("De este marco de referencia se adopta explícitamente el modelo estructurado para rastrear la depreciación contable de los componentes y las directrices para alinear el inventario informático con los registros del balance general de la empresa.");

        bai09.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai09); pol1.setTituloPolitica("Estatuto Corporativo de Destrucción Segura de Equipamiento Tecnológico"); pol1.setDescripcionPolitica("Normativa rigurosa que considera como falta grave pasible de desvinculación laboral el acto de donar, revender o desechar cualquier computadora, servidor o dispositivo de la empresa sin haber completado previamente el procedimiento formal de desmagnetización y borrado certificado de su disco de memoria."); pol1.setDocumentacionRelacionada("Manual Institucional de Manejo de Información Confidencial"); pol1.setReferenciaEspecifica("Sección: Procedimientos Finales de Retiro y Baja de Inventario");

        bai09.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai09); cult1.setElementoCultural("Cultura de Cuidado y Responsabilidad Patrimonial"); cult1.setDocumentacionRelacionada("Código de Responsabilidad Corporativa"); cult1.setReferenciaEspecifica("Fomentar en cada integrante de la empresa un sentido de propiedad y cuidado sobre los recursos tecnológicos asignados, eliminando la falsa creencia de que el equipamiento informático es inagotable o reemplazable sin impacto económico para la rentabilidad de la organización.");

        bai09.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai09); serv1.setNombreServicioHerramienta("Plataformas Centralizadas de Control Patrimonial y Descubrimiento Automático de Equipos en Red");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai09); serv2.setNombreServicioHerramienta("Sistemas Corporativos de Seguimiento y Optimización de Licencias de Programas Comerciales");

        bai09.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai09);
    }
}