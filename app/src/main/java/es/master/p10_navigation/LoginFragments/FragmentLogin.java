package es.master.p10_navigation.LoginFragments;

import static androidx.navigation.Navigation.findNavController;

import android.content.Intent;
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

import es.master.p10_navigation.Activities.ActivityHome;
import es.master.p10_navigation.R;
import es.master.p10_navigation.databinding.FragmentLoginBinding;
import es.master.p10_navigation.databinding.FragmentUnoBinding;

public class FragmentLogin extends Fragment {

    FragmentLoginBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundleRecibido = getArguments();
        if (bundleRecibido != null) {
            binding.etNombreLogin.setText(bundleRecibido.getString("nombre"));
            binding.etApellidoLogin.setText(bundleRecibido.getString("apellido"));
        }

        binding.btnOk.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(), ActivityHome.class);
            startActivity(intent);
        });
    }
}