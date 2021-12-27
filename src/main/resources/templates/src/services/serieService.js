import { http } from "./api"

export default {

    Listar() {
        return http.get('/serie')
    },

    saveSerie(serie) {
        return http.post('/serie', serie)
    },

    deleteSerie(id) {
        return http.delete(`/serie/${id}`)
    }
}
