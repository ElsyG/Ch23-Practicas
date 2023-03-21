//prueba efectiva
//const indexTest = require ("../calculadora") //el lugar donde esta el artefacto de prueba, importar el artefacto de prueba, ecma 5, version js
import {indexTest} from "../calculadora"; //ecma 6, version js
test('test suma', () => {
    const r = indexTest.suma(3,2);
    expect (r).toBe(6);
});
test.todo (test.resta);
test.todo (test.multi);
test.todo (test.div);