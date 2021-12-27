import { http } from "./api"

export default {

    listar() {
        return http.get('/filme')
    },

    saveFilme(filme) {
        return http.post('/filme', filme)
    },

    editFilme(id, filme) {
        return http.put(`/filme/${id}`, filme)
    },

    deleteFilme(id) {
        return http.delete(`/filme/${id}`)
    }
}
