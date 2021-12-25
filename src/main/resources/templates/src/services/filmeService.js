import { http } from "./api"

export default {

    listar() {
        return http.get('/filme')
    },

    saveFilme(filme) {
        return http.post('/filme', filme)
    },

    deleteFilme(id) {
        return http.put(`/filme/${id}`)
    }
}