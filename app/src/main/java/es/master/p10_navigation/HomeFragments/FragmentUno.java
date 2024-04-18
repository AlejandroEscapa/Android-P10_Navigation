package es.master.p10_navigation.HomeFragments;

import static androidx.navigation.Navigation.findNavController;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import es.master.p10_navigation.R;
import es.master.p10_navigation.databinding.FragmentUnoBinding;

public class FragmentUno extends Fragment {

    FragmentUnoBinding binding;

    public FragmentUno() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUnoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.txtNext.setOnClickListener(view1 -> {
            String nombre = binding.etNombre.getText().toString();
            String apellido = binding.etApellido.getText().toString();

            Bundle bundle = new Bundle();
            bundle.putString("nombre", nombre);
            bundle.putString("apellido", apellido);

            //Mediante NavController me muevo entre los grafos de navegaciñon.
            NavController navController = Navigation.findNavController(requireActivity(),
                    R.id.fragmentContainerView);
            navController.navigate(R.id.mainGraph_to_loginGraph, bundle);
        });
    }
}