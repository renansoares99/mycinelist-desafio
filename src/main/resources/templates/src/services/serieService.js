import { http } from "./api"

export default {

    Listar() {
        return http.get('/serie')
    },

    saveSerie(serie) {
        return http.post('/serie', serie)
    }
}