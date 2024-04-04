package project.moms.recycler.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import project.moms.recycler.data.Repository
import project.moms.recycler.models.MarsPhotosResponse
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

//    private val dateFormat = SimpleDateFormat()
//    private val _stateLoad = MutableStateFlow(false)
//    val stateLoad = _stateLoad.asStateFlow()
//    private val _datePhotos = MutableStateFlow(START_DATE)
//    val datePhotos = _datePhotos.asStateFlow()



    private val _listPhotoMars = MutableStateFlow(MarsPhotosResponse(listOf()))
    val listPhotoMars = _listPhotoMars.asStateFlow()


    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            _listPhotoMars.value = repository.loadPhoto("2020-01-01")
        }
    }
}